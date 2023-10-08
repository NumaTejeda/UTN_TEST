package com.calculadora;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;



public class CalculadoraTest {
	@Test
	public void dadoDosNumerosSumarYDividir() {
		Double num1 = 150.0;
		Double num2 = 180.0;
		Double resultadoEsperado = 110.0;
		assertEquals(resultadoEsperado, Calculadora.dividir(Calculadora.sumar(num1, num2), 3.0));
	}
	@Test
	public void dadoDosNumerosRestarYMultiplicar() {
		Double num1 = 90.0;
		Double num2 = 50.0;
		Double resultadoEsperado = 607.0;
		assertNotEquals(resultadoEsperado, Calculadora.multiplicar(Calculadora.sumar(num1, num2), 15.0));
	}
	@Test
	public void dadoDosNumerosMultiplicar() {
		Double num1 = 80.0;
		Double num2 = 3.0;
		Double resultadoEsperado = 240.0;
		assertEquals(resultadoEsperado, Calculadora.multiplicar(num1, num2));
	}
	@Test
	public void dadoDosNumerosSumarYMultiplicar() {
		Double num1 = 70.0;
		Double num2 = 40.0;
		Double resultadoNoEsperado = 2700.0;
		assertNotEquals(resultadoNoEsperado, Calculadora.multiplicar(Calculadora.sumar(num1, num2), 25.0));
	}
	
}
