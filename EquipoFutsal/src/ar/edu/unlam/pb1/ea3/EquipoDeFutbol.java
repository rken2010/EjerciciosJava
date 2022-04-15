package ar.edu.unlam.pb1.ea3;

import java.util.Arrays;

public class EquipoDeFutbol {
	private String nombre;
	private Jugador jugadores[];
	
	private final int CANTIDAD_MAXIMA_DE_JUGADORES=23;
	private int cantidadDeJugadoresActual=0;
	
	public EquipoDeFutbol(String nombre) {
		this.nombre=nombre;
		this.jugadores= new Jugador [CANTIDAD_MAXIMA_DE_JUGADORES];
	
	}

	/*
	 * La capacidad máxima de un equipo es 23. No se permiten jugadores repetidosa
	 * Se retorna el resultado de la operación
	 */
	public boolean agregarJugador(Jugador jugador) {
		boolean jugadorRepetido=false;
		boolean seAgregoJugador=false;
		
		for (int i=0; i<cantidadDeJugadoresActual;i++) {
			if(jugadores[i].getNombre().equals(jugador.getNombre())&& jugadores[i]!=null) {
				jugadorRepetido=true;	seAgregoJugador=false;
				return seAgregoJugador;
			}
		
		}
		if(cantidadDeJugadoresActual<jugadores.length && jugadorRepetido==false) {
			jugadores[cantidadDeJugadoresActual++]= jugador;
			seAgregoJugador= true;
		}
		return seAgregoJugador;
	}
	
	
		
	

	/*
	 * Permite cambiar cualquier jugador. 
	 * Para que el cambio se produzca, el jugador saliente debe estar presente en el equipo
	 */
	public boolean cambiarJugador(Jugador saliente, Jugador entrante) {
		boolean seRealizoElCambio=false;
		for(int i=0; i< jugadores.length;i++) {
			if(jugadores[i].getNombre().equals(saliente.getNombre())==true) {
				jugadores[i]= entrante;

				seRealizoElCambio=true;
				
			}
			}
		return seRealizoElCambio;
	}

	public Jugador[] getJugadores() {
		
		return jugadores;
	}
	
	/*
	 * Permite buscar un jugador por su numero. 
	 * 
	 */
	public Jugador buscar(int numero) {
		Jugador buscadoPorNumero= null;
		for(int i=0; i< jugadores.length;i++) {
			if(jugadores[i].getNumero()==numero) {
				buscadoPorNumero = jugadores[i];
			}
		}
		return buscadoPorNumero;
		
	}
	
	/*
	 * Permite buscar un jugador por su nombre. 
	 * 
	 */
	public Jugador buscar(String nombre) {
		Jugador buscadoPorNombre= null;
		for(int i=0; i< jugadores.length;i++) {
			if(jugadores[i].getNombre().equals(nombre)==true) {
				buscadoPorNombre = jugadores[i];
				return buscadoPorNombre;
			}
		}
		return buscadoPorNombre;
		
	}
	
	/*
	 * Calcula el valor del equpo. 
	 * 
	 */
	public double calcularElValorDelEquipo() {
		double valorDelEquipo=0;
		for(int i=0; i<jugadores.length;i++) {
			valorDelEquipo += jugadores[i].getPrecio();
		}
		return valorDelEquipo;
	}
	
	/*
	 * Calcula el precio promedio de sus jugadores 
	 * 
	 */
	public double calcularElPrecioPromedio() {
		double precioPromedioDelEquipo=0;
		precioPromedioDelEquipo=calcularElValorDelEquipo()/jugadores.length;
		return precioPromedioDelEquipo;
	}

	public String toString() {
		String listadoJugadores="";
		for (int i=0; i<cantidadDeJugadoresActual; i++) {
			listadoJugadores += "[" + i + "]  " + jugadores[i].getNumero() + " - "+ jugadores[i].getNombre() + "\n";
			}
		
		return listadoJugadores;
		}
	
	
	
}
