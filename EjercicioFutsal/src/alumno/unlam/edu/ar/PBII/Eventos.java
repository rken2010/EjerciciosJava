package alumno.unlam.edu.ar.PBII;

public class Eventos {
	private Jugador jugadorDelEvento;
	private ListaEventos evento;
	private int minutoDelEvento;

	public Eventos(Jugador jugadorDelEvento, ListaEventos evento, int minutoDelEvento) {

		this.jugadorDelEvento = jugadorDelEvento;
		this.evento = evento;
		this.minutoDelEvento = minutoDelEvento;
	}

	public Jugador getJugadorDelEvento() {
		return jugadorDelEvento;
	}

	public void setJugadorDelEvento(Jugador jugadorDelEvento) {
		this.jugadorDelEvento = jugadorDelEvento;
	}

	public int getMinutoDelEvento() {
		return minutoDelEvento;
	}

	public void setMinutoDelEvento(int minutoDelEvento) {
		this.minutoDelEvento = minutoDelEvento;
	}

	public ListaEventos getEvento() {
		return evento;
	}

}
