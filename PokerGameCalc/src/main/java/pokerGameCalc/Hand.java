package pokerGameCalc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Hand {

	public HandType evalHand(String string) {
		String[] karty = string.split(" ");
		
		Map<Character, Integer> figury= new HashMap<Character, Integer>();
		
		for( int i=0; i<5;i++){
			String karta = karty[i];
			char figura = karta.charAt(0);
			Integer iloscWystapien = figury.get(figura);
			if(iloscWystapien == null)
				figury.put(figura, 1);
			else
				figury.put(figura, iloscWystapien+1);
		}			
			Collection<Integer> wystapienia = figury.values();			
			ArrayList<Integer> posortowaneWystapienia = new ArrayList<Integer>(wystapienia);
			Collections.sort(posortowaneWystapienia, Collections.reverseOrder());
		if(figury.containsValue(4))
			return HandType.KARETA;
		if(posortowaneWystapienia.equals(Arrays.asList(3,2)))
			return HandType.FULL;
		if(figury.containsValue(3))
			return HandType.TROJKA; 	
		if(posortowaneWystapienia.equals(Arrays.asList(2,2,1)))
			return HandType.DWIE_PARY; 
		if(figury.containsValue(2))
			return HandType.PARA; 
//		if(posortowaneWystapienia.get(2) - posortowaneWystapienia.get(0) == 4)
//			return HandType.STRIT;
		else return null;	
		
	}	
}
