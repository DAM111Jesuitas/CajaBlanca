package cajaBlanca;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EjemploCajaBlancaTest {

	@Test
	void CP1() {
		String cadenaEsperada= "El numero -2 no es un numero perfecto";
		String cadenaObtenida = EjemploCajaBlanca.CompruebaNumeroPerfecto(-2);
		assertEquals(cadenaEsperada, cadenaObtenida);
	}
	
	@Test
	void CP3() {
		String cadenaEsperada= "El numero 28 es un numero perfecto";
		String cadenaObtenida = EjemploCajaBlanca.CompruebaNumeroPerfecto(28);
		assertEquals(cadenaEsperada, cadenaObtenida);
	}
	
	@Test
	void CP4() {
		String cadenaEsperada= "El numero 8 no es un numero perfecto";
		String cadenaObtenida = EjemploCajaBlanca.CompruebaNumeroPerfecto(8);
		assertEquals(cadenaEsperada, cadenaObtenida);
	}

}
