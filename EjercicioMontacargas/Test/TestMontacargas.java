import static org.junit.Assert.*;

import org.junit.Test;

public class TestMontacargas {

	@Test
	public void queSeCreeMontacargas() {
		Montacargas primero = new Montacargas(1000.0);
		
		assertNotNull(primero);
	}
	
	@Test
	public void queSeRealiceUnaCarga() {
		Montacargas primero = new Montacargas(1000.0);
		primero.carga(500.0);
		double expected = 500.0;
		double actual = primero.getPesoActual();
		
		assertEquals(expected, actual,0.1);
			
	}
	@Test
	public void queNoSeRealiceUnaCarga() {
		Montacargas primero = new Montacargas(1000.0);
		primero.carga(500.0);
		primero.carga(500.0);
		primero.carga(1500.0);
		double expected = 1000.0;
		double actual = primero.getPesoActual();
		
		assertEquals(expected, actual,0.1);
			
	}

}
