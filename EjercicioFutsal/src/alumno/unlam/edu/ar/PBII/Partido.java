package alumno.unlam.edu.ar.PBII;

import java.util.ArrayList;
import java.util.Iterator;



public class Partido {
	
	public int numeroPartido;
	ArrayList<Jugador> equipoLocal;
	ArrayList<Jugador> equipoVisitante;
	ArrayList<Jugador> goles;
	ArrayList<Jugador> amonestados;
	ArrayList<Jugador> expulsados;
	
	
	public Partido(int numeroPartido) {
	
		this.numeroPartido = numeroPartido;
		this.equipoLocal = new ArrayList<Jugador>();
		this.equipoVisitante = new ArrayList<Jugador>();
		this.goles = new ArrayList<Jugador>();
		this.amonestados = new ArrayList<Jugador>();
		this.expulsados = new ArrayList<Jugador>();
	}

	public void agregarJugador(Jugador jugadorParaAgregar) {
		if( jugadorParaAgregar.isLocal() ) {
			equipoLocal.add(jugadorParaAgregar);
		}
		else {
			equipoVisitante.add(jugadorParaAgregar);
		}
	}
	
	public Jugador buscarJugadorPorDNIEnEquipoLocal (int dniABuscar) {
		for (int i = 0; i < equipoLocal.size(); i++) {
			if(equipoLocal.get(i).getDNI()== dniABuscar) {
				return equipoLocal.get(i);
			}
		}
		return null;
	}
	
	public Jugador buscarJugadorPorDNIEnEquipoVisitante (int dniABuscar) {
		for (int i = 0; i < equipoVisitante.size(); i++) {
			if(equipoVisitante.get(i).getDNI()== dniABuscar) {
				return equipoVisitante.get(i);
			}
		}
		return null;
	}
	
	public double valorDelEquipoLocal() {
		double valorEquipo = 0.0;
		for (int i = 0; i < equipoLocal.size(); i++) {
			valorEquipo += equipoLocal.get(i).getValorJugador();
		}
		return valorEquipo;
	}
	
	public double calcularPromedioEquipoLocal() {
		double edadEquipo = 0.0;
		for (int i = 0; i < equipoLocal.size(); i++) {
			edadEquipo += equipoLocal.get(i).getEdad();
		}
		return edadEquipo / equipoLocal.size();
	}
	
	public double valorDelEquipoVisitante() {
		double valorEquipo = 0.0;
		for (int i = 0; i < equipoVisitante.size(); i++) {
			valorEquipo += equipoVisitante.get(i).getValorJugador();
		}
		return valorEquipo;
	}


	public void registrarGolLocal(Jugador anotador) {
		if( buscarJugadorPorDNIEnEquipoLocal(anotador.getDNI()) != null) {
			goles.add(anotador);
		}
	}
	
	public void registrarGolVisitante(Jugador anotador) {
		if( buscarJugadorPorDNIEnEquipoVisitante(anotador.getDNI()) != null) {
			goles.add(anotador);
		}
	}

	public String mostrarResultado() {
		int golesLocales = 0;
		int golesVisitantes = 0;
		
		for (int i = 0; i < goles.size(); i++) {
			if ( goles.get(i).isLocal() == true) {
				golesLocales ++;
			}
			else { golesVisitantes ++; };
			
		}
		return "Resultado del partido \n"+ "Local: "+golesLocales+"\n"+"Visitante: "+ golesVisitantes;
		
	}

	public void amonestarJugador(Jugador jugadorAmonestado) {
		if( buscarJugadorPorDNIEnEquipoVisitante(jugadorAmonestado.getDNI()) != null) {
			if(amonestados.contains(jugadorAmonestado)) {
				expulsados.add(jugadorAmonestado);
				amonestados.remove(jugadorAmonestado);
			}
			else { amonestados.add(jugadorAmonestado);}
		}
		else if ( buscarJugadorPorDNIEnEquipoLocal(jugadorAmonestado.getDNI()) != null){
			if(amonestados.contains(jugadorAmonestado)) {
				expulsados.add(jugadorAmonestado);
				amonestados.remove(jugadorAmonestado);
			}
			else { amonestados.add(jugadorAmonestado);}
		}
	}

	
	
	
}
