package pbII.alumno.unlam.edu.ar;

public class Cliente {

	private String nombre;
	private final int DNI;

	public Cliente(String nombre, int DNI) {
		this.nombre = nombre;
		this.DNI = DNI;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDNI() {
		return DNI;
	}

}
