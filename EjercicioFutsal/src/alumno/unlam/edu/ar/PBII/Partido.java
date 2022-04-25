package alumno.unlam.edu.ar.PBII;

import java.util.ArrayList;
import java.util.Iterator;



public class Partido {
	
	public int numeroPartido;
	ArrayList<Jugador> equipoLocal;
	ArrayList<Jugador> equipoVisitante;
	ArrayList<Eventos> eventosDelPartido;
	
	
	public Partido(int numeroPartido) {
	
		this.numeroPartido = numeroPartido;
		this.equipoLocal = new ArrayList<Jugador>();
		this.equipoVisitante = new ArrayList<Jugador>();
		this.eventosDelPartido = new ArrayList<Eventos>();
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
	
	public Jugador buscarJugadorEnEventosDelPartido( int dniABuscar) {
		for (int i = 0; i < eventosDelPartido.size(); i++) {
			if(eventosDelPartido.get(i).getJugadorDelEvento().getDNI()== dniABuscar) {
				return eventosDelPartido.get(i).getJugadorDelEvento();
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


	public void registrarGol(Jugador anotador , int minutoAnotacion) {
		if ( buscarJugadorPorDNIEnEquipoLocal( anotador.getDNI()) != null) {
			Eventos gol = new Eventos ( anotador, ListaEventos.GOL, minutoAnotacion);
			eventosDelPartido.add(gol);
		}
		else if ( buscarJugadorPorDNIEnEquipoVisitante(anotador.getDNI()) != null ) {
			Eventos gol = new Eventos ( anotador, ListaEventos.GOL, minutoAnotacion);
			eventosDelPartido.add(gol);
		}
		
	}

	public String mostrarResultado() {
		int golesLocales = 0;
		int golesVisitantes = 0;
		
		for (int i = 0; i < eventosDelPartido.size(); i++) {
			if ( eventosDelPartido.get(i).getEvento() == ListaEventos.GOL && eventosDelPartido.get(i).getJugadorDelEvento().isLocal()==true) {
				golesLocales ++;
			}
			else { golesVisitantes ++; };
			
		}
		return "Resultado del partido \n"+ "Local: "+golesLocales+"\n"+"Visitante: "+ golesVisitantes;
		
	}

	public void amonestarJugador(Jugador jugadorAmonestado , int minutoAmonestacion) {
		if( eventosDelPartido.size() != 0 ) {
			for (int i = 0; i <= equipoVisitante.size(); i++) {
				if( eventosDelPartido.get(i).getEvento() == ListaEventos.AMONESTACION) {
					if( eventosDelPartido.get(i).getJugadorDelEvento().getDNI() == jugadorAmonestado.getDNI()) {
						expulsarJugador(jugadorAmonestado, minutoAmonestacion);
					}
					else {
						Eventos amonestacion = new Eventos ( jugadorAmonestado ,  ListaEventos.AMONESTACION, minutoAmonestacion );
						eventosDelPartido.add(amonestacion);
					}
				}
			}
		}
		else { 
			Eventos amonestacion = new Eventos ( jugadorAmonestado ,  ListaEventos.AMONESTACION, minutoAmonestacion );
			eventosDelPartido.add(amonestacion);
		}
	}
	
	public void expulsarJugador (Jugador jugadorExpulsado , int minutoExpusion ) {
		Eventos expulsion = new Eventos ( jugadorExpulsado ,  ListaEventos.EXPULSION, minutoExpusion );
		eventosDelPartido.add(expulsion);
	}

	
	
	
}
