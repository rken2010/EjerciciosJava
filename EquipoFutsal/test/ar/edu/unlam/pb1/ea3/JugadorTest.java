package ar.edu.unlam.pb1.ea3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ar.edu.unlam.pb1.ea3.Jugador;

public class JugadorTest {
	@Test
	public void queUnJugadorSeaIgualAOtroPorSuNombre() {
		Jugador elPajaro = new Jugador(8, "Claudio Caniggia", 10000000);
		Jugador elHijoDelViento = new Jugador(7, "Claudio Caniggia", 9000000);
		
		assertEquals(elPajaro.getNombre(), elHijoDelViento.getNombre());
		
	}
}
