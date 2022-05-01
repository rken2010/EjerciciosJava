package pbII.alumno.unlam.edu.ar;
import static org.junit.Assert.*;

import org.junit.Test;

import pbII.alumno.unlam.edu.ar.Banco;
import pbII.alumno.unlam.edu.ar.Cliente;
import pbII.alumno.unlam.edu.ar.Cuenta;

public class TestCuentas {

	@Test
	public void queSeCreeBanco() {
		Banco Provincia = new Banco( "Provincia" );
		
		assertNotNull(Provincia);

	}
	
	@Test
	public void queSeCreeCuenta() {
		Cuenta standar = new Cuenta( 1000.00 );
		
		assertNotNull(standar);

	}
	
	@Test
	public void queSeCreeCliente() {
		Cliente Jorge = new Cliente( "Jorge Ibañez", 31774500 );
		
		assertNotNull(Jorge);

	}

}
