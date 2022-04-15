package ar.edu.unlam.pb1.ea3;

public class Jugador {

	private int numero;
	private String nombre;
	private double precio;
	
	private final  int CANTIDAD_MAXIMA_DE_JUGADORES=23;
	
	public Jugador(int numero, String nombre, double precio) {
		this.numero=numero;
		this.nombre=nombre;
		this.precio=precio;
		
	}
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
}
