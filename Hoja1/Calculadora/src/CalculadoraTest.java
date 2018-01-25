import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void testCalculadora() {
		// fail("Not yet implemented");

	}

	@Test
	public void testSuma() {
		// fail("Not yet implemented");
		Calculadora calculadora = new Calculadora(10, 20);
		int resultado = calculadora.suma();
		assertEquals(30, resultado);
	}

	@Test
	public void testResta() {
		Calculadora calculadora = new Calculadora(10, 20);
		int resultado = calculadora.resta();
		assertEquals(10, resultado);
		calculadora = new Calculadora(20, 10);
		resultado = calculadora.resta();
		assertEquals(10, resultado);

		// fail("Not yet implemented");
	}

	@Test
	public void testMultiplica() {
		// fail("Not yet implemented");
		Calculadora calculadora = new Calculadora(2, 10);
		int resultado = calculadora.multiplica();
		assertEquals(20, resultado);

	}

	@Test
	public void testDivide() {
		// fail("Not yet implemented");
		Calculadora calculadora = new Calculadora(20, 10);
		int resultado = calculadora.divide();
		assertEquals(2, resultado);

	}

	public void testDivide2() {
		// fail("Not yet implemented");
		Calculadora calculadora = new Calculadora(20, 0);
		int resultado = calculadora.divide();
		assertEquals(null, resultado);
		calculadora = new Calculadora(20, 5);
		resultado = calculadora.divide();
		assertEquals(null, resultado);

	}

}
