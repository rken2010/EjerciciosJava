package alumno.unlam.edu.ar.PBII;

public class Jugador {
	
	private final int DNI;
	private final String NOMBRE;
	private final String APELLIDO;
	private int numero;
	private int edad;
	private double valorJugador;
	private boolean local;
	private Puesto puesto;


	public Jugador (int DNI, String NOMBRE, String APELLIDO, int numero, int edad, double valorJugador, boolean local, Puesto puesto) {
		this.DNI = DNI;
		this.NOMBRE = NOMBRE;
		this.APELLIDO = APELLIDO;
		this.numero = numero;
		this.edad = edad;
		this.valorJugador = valorJugador;
		this.local = local;
		this.puesto = puesto;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getValorJugador() {
		return valorJugador;
	}

	public void setValorJugador(double valorJugador) {
		this.valorJugador = valorJugador;
	}

	public boolean isLocal() {
		return local;
	}

	public void setLocal(boolean local) {
		this.local = local;
	}

	public int getDNI() {
		return DNI;
	}

	public String getNOMBRE() {
		return NOMBRE;
	}

	public String getAPELLIDO() {
		return APELLIDO;
	}

	

	
	
	

}
