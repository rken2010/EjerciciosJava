package alumno.unlam.edu.ar.PBII;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestFutsal {

	@Test
	public void crearJugador() {
		
		Jugador Messi = new Jugador(  123456,  "LEONEL" ,  "MESSI" ,  10,  34, 500.0 ,true, Puesto.DELANTERO);
		Jugador valorEsperado = Messi;
		
		
		assertNotNull(valorEsperado);
		
	}
	
	
	@Test
	public void crearPartido() {
		
		Partido libertadores = new Partido( 1 );
		Partido valorEsperado = libertadores;
		
		
		assertNotNull(valorEsperado);
		
	}
	@Test
	public void cargarJugadorEnEquipo() {
		
		Jugador Messi = new Jugador(  123456,  "LEONEL" ,  "MESSI" ,  10,  34, 500.0 ,true, Puesto.DELANTERO);
		Jugador Neymar = new Jugador(  789465,  "NEY" ,  "NEYMAR" ,  10,  34, 500.0 ,false, Puesto.DELANTERO);
		
		Partido libertadores = new Partido( 1 );
		libertadores.agregarJugador(Messi);
		libertadores.agregarJugador(Neymar);
		
		boolean estaVacioLocal = libertadores.equipoLocal.isEmpty();
		boolean estaVacioVisitante = libertadores.equipoVisitante.isEmpty();
		
		assertNotNull(libertadores.equipoLocal);
		assertEquals( Messi, libertadores.equipoLocal.get(0));
		assertFalse(estaVacioLocal);
		assertFalse(estaVacioVisitante);
		
	}
	
	@Test
	public void queEncuentreAlJugadorPorDni() {
		Jugador Messi = new Jugador(  123456,  "LEONEL" ,  "MESSI" ,  10,  34, 500.0 ,true, Puesto.DELANTERO);
		Jugador Neymar = new Jugador(  789465,  "NEY" ,  "NEYMAR" ,  10,  34, 500.0 ,false, Puesto.DELANTERO);
		
		Partido libertadores = new Partido( 1 );
		libertadores.agregarJugador(Messi);
		libertadores.agregarJugador(Neymar);
		
		Jugador expected = Messi;
		Jugador actual = libertadores.buscarJugadorPorDNIEnEquipoLocal(123456);
		
		assertEquals(expected, actual);
		
	}
	
	@Test
	public void mostrarValorDelEquipo() {
		
					
		Jugador Messi = new Jugador(  123456,  "LEONEL" ,  "MESSI" ,  10,  34, 500.0 ,true, Puesto.DELANTERO);
		Jugador Neymar = new Jugador(  789465,  "NEY" ,  "NEYMAR" ,  10,  34, 500.0 ,true, Puesto.DELANTERO);
		
		Partido libertadores = new Partido( 1 );
		libertadores.agregarJugador(Messi);
		libertadores.agregarJugador(Neymar);
		
		double valorEsperado = 1000;
		double valorActual = libertadores.valorDelEquipoLocal();
		
		
		assertEquals(valorEsperado, valorActual, 0.1 );
	}
	
	@Test
	public void queSeRegistreElGol() {
		
		Jugador Messi = new Jugador(  123456,  "LEONEL" ,  "MESSI" ,  10,  34, 500.0 ,true, Puesto.DELANTERO);
		Partido libertadores = new Partido( 1 );
		
		libertadores.agregarJugador(Messi);
		libertadores.registrarGolLocal(Messi);
		
		int expecteds = 1;
		int actuals = libertadores.goles.size();
		
		assertEquals(expecteds, actuals, 0.1);
		
	}
	@Test
	public void queSeMuestreElResultado() {
		
		Jugador Messi = new Jugador(  123456,  "LEONEL" ,  "MESSI" ,  10,  34, 500.0 ,true, Puesto.DELANTERO);
		Jugador Neymar = new Jugador(  789465,  "NEY" ,  "NEYMAR" ,  10,  34, 500.0 ,true, Puesto.DELANTERO);
		Partido libertadores = new Partido( 1 );
		
		libertadores.agregarJugador(Messi);
		libertadores.agregarJugador(Neymar);
		
		libertadores.registrarGolLocal(Messi);
		libertadores.registrarGolLocal(Neymar);
		libertadores.mostrarResultado();
		
		String valorEsperado = "Resultado del partido \n"+ "Local: 2"+"\n"+"Visitante: 0";
		String valorActual = libertadores.mostrarResultado();
		
		assertEquals(valorEsperado, valorActual);
	
	}
	@Test
	public void queSeCargueUnaAmarillaAlJugador( ) {
		Jugador Messi = new Jugador(  123456,  "LEONEL" ,  "MESSI" ,  10,  34, 500.0 ,true, Puesto.DELANTERO);
		Jugador Neymar = new Jugador(  789465,  "NEY" ,  "NEYMAR" ,  10,  34, 500.0 ,true, Puesto.DELANTERO);
		Partido libertadores = new Partido( 1 );
		
		libertadores.agregarJugador(Messi);
		libertadores.agregarJugador(Neymar);
		libertadores.amonestarJugador(Messi);

		
		Jugador expecteds = Messi;
		Jugador actuals = libertadores.amonestados.get(0);
			
		assertEquals(expecteds, actuals);
	}


}
