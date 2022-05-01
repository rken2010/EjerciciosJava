
public class Montacargas {

	private double PESO_MAXIMO;
	private double pesoActual;

	public Montacargas(double PESO_MAXIMO) {
		this.PESO_MAXIMO = PESO_MAXIMO;
		this.pesoActual = 0;
	}
	
		

	public boolean carga(double pesoCarga) {
				
		if( PESO_MAXIMO >= pesoCarga+pesoActual) {
			setPesoActual(pesoCarga+getPesoActual());
			return true; 
		}
		
		return false;
	}



	public double getPesoActual() {
		return pesoActual;
	}


	public void setPesoActual(double pesoActual) {
		this.pesoActual = pesoActual;
	}

}
