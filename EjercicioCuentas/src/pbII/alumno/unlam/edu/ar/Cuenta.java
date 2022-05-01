package pbII.alumno.unlam.edu.ar;

public class Cuenta {

	private double saldo;
	private Cliente propietario;

	public Cuenta(double saldoInicial, Cliente propietario) {
		this.saldo = saldoInicial;
		this.propietario = propietario;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
