package ar.edu.unlam.pb1.ea3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.Iterator;

import org.junit.Test;

import ar.edu.unlam.pb1.ea3.EquipoDeFutbol;
import ar.edu.unlam.pb1.ea3.Jugador;


public class EquipoDeFultbolTest {

	@Test 
	public void queSePuedaCrearUnEquipoVacio() {
		EquipoDeFutbol napoli = new EquipoDeFutbol("Napoli");
		
		//assertNull(napoli.getJugadores()[0]);
		
		Jugador losJugadoresDelNapoli[] = napoli.getJugadores();
		
		for(int i = 0; i<losJugadoresDelNapoli.length; i++) {
			assertNull(losJugadoresDelNapoli[i]);
		}		
	}
	
	@Test 
	public void queSePuedanAgregarJugadorAlEquipo() {
		
		Jugador laPulga = new Jugador(10, "Lionel Messi", 999999999);
		EquipoDeFutbol barcelona = new EquipoDeFutbol("Barcelona");
		barcelona.agregarJugador(laPulga);
		
		assertEquals(10, barcelona.getJugadores()[0].getNumero());
		assertEquals("Lionel Messi", barcelona.getJugadores()[0].getNombre());
		
	}
	
	@Test 
	public void queNoPermitaAgregarUnJugadorExistente() {
		
		EquipoDeFutbol barcelona = new EquipoDeFutbol("Barcelona");
		Jugador laPulga = new Jugador(10, "Lionel Messi", 999999999);
		
		assertTrue(barcelona.agregarJugador(laPulga));
		assertEquals("Lionel Messi", barcelona.getJugadores()[0].getNombre());
		
		Jugador elMejor = new Jugador(1, "Lionel Messi", 1);
		assertFalse(barcelona.agregarJugador(elMejor));
		
		assertNull(barcelona.getJugadores()[1]);
	}
	
	@Test 
	public void queNoSePuedaAgregarMasJugadoresQueLaCantidadMaximaPermitida(){
		
		EquipoDeFutbol argentina = new EquipoDeFutbol("Argentina");
		
		argentina.agregarJugador(new Jugador(1, "Sergio Romero", 10000));
		argentina.agregarJugador(new Jugador(2, "Ezequiel Garay", 10000));
		argentina.agregarJugador(new Jugador(3, "Hugo Campagnaro", 10000));
		argentina.agregarJugador(new Jugador(4, "Pablo Zabaleta", 10000));
		argentina.agregarJugador(new Jugador(5, "Fernando Gago", 10000));
		argentina.agregarJugador(new Jugador(6, "Lucas Biglia", 10000));
		argentina.agregarJugador(new Jugador(7, "Ángel Di María", 10000));
		argentina.agregarJugador(new Jugador(8, "Enzo Pérez", 10000));
		argentina.agregarJugador(new Jugador(9, "Gonzalo Higuaín", 10000));
		argentina.agregarJugador(new Jugador(10, "Lionel Messi", 10000));
		argentina.agregarJugador(new Jugador(11, "Maximiliano Rodríguez", 10000));
		argentina.agregarJugador(new Jugador(12, "Agustín Orion", 10000));
		argentina.agregarJugador(new Jugador(13, "Augusto Fernández", 10000));
		argentina.agregarJugador(new Jugador(14, "Javier Mascherano", 10000));
		argentina.agregarJugador(new Jugador(15, "Martín Demichelis", 10000));
		argentina.agregarJugador(new Jugador(16, "Marcos Rojo", 10000));
		argentina.agregarJugador(new Jugador(17, "Federico Fernández", 10000));
		argentina.agregarJugador(new Jugador(18, "Rodrigo Palacio", 10000));
		argentina.agregarJugador(new Jugador(19, "Ricardo Álvarez", 10000));
		argentina.agregarJugador(new Jugador(20, "Sergio Agüero", 10000));
		argentina.agregarJugador(new Jugador(21, "Mariano Andújar", 10000));
		argentina.agregarJugador(new Jugador(22, "Ezequiel Lavezzi", 10000));
		argentina.agregarJugador(new Jugador(23, "José Basanta", 10000));

		assertFalse(argentina.agregarJugador(new Jugador(24, "Eber Ludueña", 0)));
		
		assertEquals(23, argentina.getJugadores().length);
	}
	
	@Test
	public void queSePuedaCambiarUnJugador() {
		
		EquipoDeFutbol argentina = new EquipoDeFutbol("Argentina");
		
		argentina.agregarJugador(new Jugador(1, "Sergio Romero", 10000));
		argentina.agregarJugador(new Jugador(2, "Ezequiel Garay", 10000));
		argentina.agregarJugador(new Jugador(3, "Hugo Campagnaro", 10000));
		argentina.agregarJugador(new Jugador(4, "Pablo Zabaleta", 10000));
		argentina.agregarJugador(new Jugador(5, "Fernando Gago", 10000));
		argentina.agregarJugador(new Jugador(6, "Lucas Biglia", 10000));
		argentina.agregarJugador(new Jugador(7, "Ángel Di María", 10000));
		argentina.agregarJugador(new Jugador(8, "Enzo Pérez", 10000));
		argentina.agregarJugador(new Jugador(9, "Gonzalo Higuaín", 10000));
		argentina.agregarJugador(new Jugador(10, "Lionel Messi", 10000));
		argentina.agregarJugador(new Jugador(11, "Maximiliano Rodríguez", 10000));
		argentina.agregarJugador(new Jugador(12, "Agustín Orion", 10000));
		argentina.agregarJugador(new Jugador(13, "Augusto Fernández", 10000));
		argentina.agregarJugador(new Jugador(14, "Javier Mascherano", 10000));
		argentina.agregarJugador(new Jugador(15, "Martín Demichelis", 10000));
		argentina.agregarJugador(new Jugador(16, "Marcos Rojo", 10000));
		argentina.agregarJugador(new Jugador(17, "Federico Fernández", 10000));
		argentina.agregarJugador(new Jugador(18, "Rodrigo Palacio", 10000));
		argentina.agregarJugador(new Jugador(19, "Ricardo Álvarez", 10000));
		argentina.agregarJugador(new Jugador(20, "Sergio Agüero", 10000));
		argentina.agregarJugador(new Jugador(21, "Mariano Andújar", 10000));
		argentina.agregarJugador(new Jugador(22, "Ezequiel Lavezzi", 10000));
		argentina.agregarJugador(new Jugador(23, "José Basanta", 10000));
		
		Jugador saliente = new Jugador (10, "Lionel Messi", 10000);
		Jugador entrante = new Jugador (10, "Nacho Fernandez", 10000);

		assertTrue(argentina.cambiarJugador(saliente, entrante));
		
		assertNull(argentina.buscar("Lionel Messi"));
		assertNotNull(argentina.buscar("Nacho Fernandez"));
		
		assertNotNull(argentina.buscar(10));
		
	}
	
	@Test 
	public void queNoSePuedaCambiarUnJugadorInexistente(){
	
		EquipoDeFutbol argentina = new EquipoDeFutbol("Argentina");
		
		argentina.agregarJugador(new Jugador(1, "Sergio Romero", 10000));
		argentina.agregarJugador(new Jugador(2, "Ezequiel Garay", 10000));
		argentina.agregarJugador(new Jugador(3, "Hugo Campagnaro", 10000));
		argentina.agregarJugador(new Jugador(4, "Pablo Zabaleta", 10000));
		argentina.agregarJugador(new Jugador(5, "Fernando Gago", 10000));
		argentina.agregarJugador(new Jugador(6, "Lucas Biglia", 10000));
		argentina.agregarJugador(new Jugador(7, "Ángel Di María", 10000));
		argentina.agregarJugador(new Jugador(8, "Enzo Pérez", 10000));
		argentina.agregarJugador(new Jugador(9, "Gonzalo Higuaín", 10000));
		argentina.agregarJugador(new Jugador(10, "Lionel Messi", 10000));
		argentina.agregarJugador(new Jugador(11, "Maximiliano Rodríguez", 10000));
		argentina.agregarJugador(new Jugador(12, "Agustín Orion", 10000));
		argentina.agregarJugador(new Jugador(13, "Augusto Fernández", 10000));
		argentina.agregarJugador(new Jugador(14, "Javier Mascherano", 10000));
		argentina.agregarJugador(new Jugador(15, "Martín Demichelis", 10000));
		argentina.agregarJugador(new Jugador(16, "Marcos Rojo", 10000));
		argentina.agregarJugador(new Jugador(17, "Federico Fernández", 10000));
		argentina.agregarJugador(new Jugador(18, "Rodrigo Palacio", 10000));
		argentina.agregarJugador(new Jugador(19, "Ricardo Álvarez", 10000));
		argentina.agregarJugador(new Jugador(20, "Sergio Agüero", 10000));
		argentina.agregarJugador(new Jugador(21, "Mariano Andújar", 10000));
		argentina.agregarJugador(new Jugador(22, "Ezequiel Lavezzi", 10000));
		argentina.agregarJugador(new Jugador(23, "José Basanta", 10000));
		
		Jugador saliente = new Jugador (10, "Diego Maradona", 10000);
		Jugador entrante = new Jugador (10, "Pablo Aimar", 10000);

		assertFalse(argentina.cambiarJugador(saliente, entrante));
	}
	
	@Test 
	public void queCalculaBienElValorDelEquipo(){
	
		EquipoDeFutbol argentina = new EquipoDeFutbol("Argentina");
		
		argentina.agregarJugador(new Jugador(1, "Sergio Romero", 10000));
		argentina.agregarJugador(new Jugador(2, "Ezequiel Garay", 10000));
		argentina.agregarJugador(new Jugador(3, "Hugo Campagnaro", 10000));
		argentina.agregarJugador(new Jugador(4, "Pablo Zabaleta", 10000));
		argentina.agregarJugador(new Jugador(5, "Fernando Gago", 10000));
		argentina.agregarJugador(new Jugador(6, "Lucas Biglia", 10000));
		argentina.agregarJugador(new Jugador(7, "Ángel Di María", 10000));
		argentina.agregarJugador(new Jugador(8, "Enzo Pérez", 10000));
		argentina.agregarJugador(new Jugador(9, "Gonzalo Higuaín", 10000));
		argentina.agregarJugador(new Jugador(10, "Lionel Messi", 10000));
		argentina.agregarJugador(new Jugador(11, "Maximiliano Rodríguez", 10000));
		argentina.agregarJugador(new Jugador(12, "Agustín Orion", 10000));
		argentina.agregarJugador(new Jugador(13, "Augusto Fernández", 10000));
		argentina.agregarJugador(new Jugador(14, "Javier Mascherano", 10000));
		argentina.agregarJugador(new Jugador(15, "Martín Demichelis", 10000));
		argentina.agregarJugador(new Jugador(16, "Marcos Rojo", 10000));
		argentina.agregarJugador(new Jugador(17, "Federico Fernández", 10000));
		argentina.agregarJugador(new Jugador(18, "Rodrigo Palacio", 10000));
		argentina.agregarJugador(new Jugador(19, "Ricardo Álvarez", 10000));
		argentina.agregarJugador(new Jugador(20, "Sergio Agüero", 10000));
		argentina.agregarJugador(new Jugador(21, "Mariano Andújar", 10000));
		argentina.agregarJugador(new Jugador(22, "Ezequiel Lavezzi", 10000));
		argentina.agregarJugador(new Jugador(23, "José Basanta", 10000));
		
		assertEquals(230000.0, argentina.calcularElValorDelEquipo(), 0.01);
	}
	
	@Test 
	public void queCalculaBienElPrecioPromedio(){
	
		EquipoDeFutbol argentina = new EquipoDeFutbol("Argentina");
		
		argentina.agregarJugador(new Jugador(1, "Sergio Romero", 10000));
		argentina.agregarJugador(new Jugador(2, "Ezequiel Garay", 10000));
		argentina.agregarJugador(new Jugador(3, "Hugo Campagnaro", 10000));
		argentina.agregarJugador(new Jugador(4, "Pablo Zabaleta", 10000));
		argentina.agregarJugador(new Jugador(5, "Fernando Gago", 10000));
		argentina.agregarJugador(new Jugador(6, "Lucas Biglia", 10000));
		argentina.agregarJugador(new Jugador(7, "Ángel Di María", 10000));
		argentina.agregarJugador(new Jugador(8, "Enzo Pérez", 10000));
		argentina.agregarJugador(new Jugador(9, "Gonzalo Higuaín", 10000));
		argentina.agregarJugador(new Jugador(10, "Lionel Messi", 10000));
		argentina.agregarJugador(new Jugador(11, "Maximiliano Rodríguez", 10000));
		argentina.agregarJugador(new Jugador(12, "Agustín Orion", 10000));
		argentina.agregarJugador(new Jugador(13, "Augusto Fernández", 10000));
		argentina.agregarJugador(new Jugador(14, "Javier Mascherano", 10000));
		argentina.agregarJugador(new Jugador(15, "Martín Demichelis", 10000));
		argentina.agregarJugador(new Jugador(16, "Marcos Rojo", 10000));
		argentina.agregarJugador(new Jugador(17, "Federico Fernández", 10000));
		argentina.agregarJugador(new Jugador(18, "Rodrigo Palacio", 10000));
		argentina.agregarJugador(new Jugador(19, "Ricardo Álvarez", 10000));
		argentina.agregarJugador(new Jugador(20, "Sergio Agüero", 10000));
		argentina.agregarJugador(new Jugador(21, "Mariano Andújar", 10000));
		argentina.agregarJugador(new Jugador(22, "Ezequiel Lavezzi", 10000));
		argentina.agregarJugador(new Jugador(23, "José Basanta", 10000));
		
		assertEquals(10000, argentina.calcularElPrecioPromedio(), 0.01);
	}
}
