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
	
//	@Test
//	public void evalHandTestStrit(){
//		assertEquals(HandType.STRIT, hand.evalHand("2S 3K 4H 5C 6H"));
//	}
}