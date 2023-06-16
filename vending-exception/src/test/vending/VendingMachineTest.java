package vending;

import static org.junit.Assert.*;

import java.util.Iterator;

import org.junit.Test;

public class VendingMachineTest {
	
	VendingMachine vend;
	//primeiroTeste
	@Test
	public void inicializandoOVendinMachinTest() {
		vend = new VendingMachine();
		assertEquals("Inicializa��o com valor 0 para o curValue",vend.currValue,0);
		assertEquals("Inicializa��o com valor 0 para o toValue",0, vend.totValue);
		assertTrue(vend.d!= null);
		assertTrue(vend.d instanceof Dispenser);
	}
	//SegundoTest
	@Test
	public void verificandoValoresParaInsertCoin() {
		vend = new VendingMachine();
		assertEquals(25,vend.insertCoin());
	}
	//TerceiroTest
	@Test
	public void verificandoValoresParareturnCoin() {
		vend = new VendingMachine();
		//Verificamos se o valor inicial � igual ao �ltimo valor
		assertEquals(vend.returnCoin(),vend.currValue);
		//Inserirmos uma valor ou seja dinheiro, depois varificamos se seu retorno � 25
		vend.insertCoin();
		assertEquals(vend.returnCoin(),25);
		
	}
	@Test
	public void verificandoValoresVendItem() {
		vend = new VendingMachine();
		//inserirmos um valor igual a 50 e verificamos se seu troco � igual a 0, pois o produto est� comprado.
		vend.insertCoin();
		vend.insertCoin();
		assertEquals(vend.vendItem(7), 0);
		
	}

}
