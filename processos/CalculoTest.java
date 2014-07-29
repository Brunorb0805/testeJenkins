package processos;

import junit.framework.TestCase;

class CalculoTest extends TestCase {
	
	public void testExecutaCalculo(){
		float valor1 = 10;
		float valor2 = 5;
		float valorEsperado = 10;
		
		float valorRetornado = Calculo.executaCalculo(valor1,valor2);
		assertEquals(valorEsperado,valorRetornado,0);
		
		valorRetornado = Calculo.executaCalculoS(valor1,valor2);
		assertEquals(valorEsperado,valorRetornado,0);
	}
	
	public void testIgualdade(){
		boolean bool = Calculo.igualdade("Bruno","A");
		assertTrue("Nome válido",bool);
	}
}
