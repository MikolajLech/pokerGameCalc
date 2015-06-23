package pokerGameCalc;

import static org.junit.Assert.*;

import org.junit.Test;

import pokerGameCalc.Hand;
import pokerGameCalc.HandType;

/**
 * @author MILECH
 *
 */
public class PokerTest {
//	7D 2S 5D 3S AC
//	5C AD 5D AC 9C
//	7C 5H 8D TD KS
//	3H 7H 6S KC JS
	Hand hand = new Hand();
	@Test
	public void evalHandTestPara() {
		assertEquals(HandType.PARA, hand.evalHand("8C 8S KC 9H 4S"));
	}
	
	@Test
	public void evalHandTestTrojka() {
		assertEquals(HandType.TROJKA, hand.evalHand("8C 8S 8C 9H 4S"));
	}
	
	@Test
	public void evalHandTest2Pary(){
		assertEquals(HandType.DWIE_PARY, hand.evalHand("8C 8S 9C 9H 4S"));
	}
	
	@Test
	public void evalHandTestKareta(){
		assertEquals(HandType.KARETA, hand.evalHand("2S 2K 2H 2C 5H"));
	}
	
	@Test
	public void evalHandTestFull(){
		assertEquals(HandType.FULL, hand.evalHand("2S 2K 2H 5C 5H"));
	}
	
	

}