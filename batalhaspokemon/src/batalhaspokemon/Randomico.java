package batalhaspokemon;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Randomico {

	public static void main(String[] args) {
		givenList_whenNumberElementsChosen_shouldReturnRandomElementsRepeat();

	}

	public static void givenList_whenNumberElementsChosen_shouldReturnRandomElementsRepeat() {
	    Random rand = new Random();
	    List<String> givenList = Arrays.asList("agua", "planta", "fogo");

	    int numberOfElements = 26;

	    for (int i = 1; i <= numberOfElements; i++) {
	        int randomIndex = rand.nextInt(givenList.size());
	        String randomElement = givenList.get(randomIndex);
	        
        	System.out.print("\"" + randomElement + "\"");
        	if(i != 26)
        		System.out.print(",");
        	
        	if(i%5 == 0)
        		System.out.print("\n");
	    }
	}
}
