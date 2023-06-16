package vending;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DispenserTest {
	VendingMachine vend = new VendingMachine();
	Dispenser dis = new Dispenser();
	@Before
	public void setUp() throws Exception {
		//VendingMachine vend = new VendingMachine();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void vamosVerificarDispense() {
		//Inserimos valores ou seja moedas
		vend.insertCoin();
		int coins = vend.insertCoin();
		// verificamos se o valor minimos pode comprar um item
		assertEquals(coins, dis.dispense(coins,3));
		
		
	}
	@Test
	public void VerificandoAFuncaoAvaliable() {
		assertFalse(dis.available(0));
		assertFalse(!(dis.available(3)));
		
		
	}
	 @Test(expected = NoCoinsException.class)
	    public void testQuandoNenhumaMoedaInserida() throws NoCoinsException {
	       dis.dispense(0,3);
	       dis.dispense(vend.insertCoin(), 0);
	      dis.dispense(vend.insertCoin(), 21);
	    }
	 
	 @Test(expected = InvalidItemException.class)
	    public void testQuandoValoresInseridosSaoDiferentesDoEsperado() throws InvalidItemException {
		
	       dis.dispense(vend.insertCoin(), 0);
	       dis.dispense(vend.insertCoin(), 21);
	    }
	 @Test(expected = NotEnoughtCreditException.class)
	    public void testQuandoValoresInseridosSaoNegativos() throws NotEnoughtCreditException {
		
		 dis.dispense(-25, 3);
	    }
	 

}
