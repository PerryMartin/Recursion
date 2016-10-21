
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner stringInput = new Scanner(System.in);
		
		String inputString = stringInput.nextLine();
		
		reverseString(inputString);
		
		System.out.println(" ");
		System.out.println("OUT");
		
		}
	
	public static void reverseString(String theStringToReverse){
		
		String firstCharacter;
		
		int lengthOfString = theStringToReverse.length();
		String subStringPassed;
		
		if (theStringToReverse.length() > 0) {
			subStringPassed = theStringToReverse.substring(1, lengthOfString);
			
			System.out.println(subStringPassed);
			
			firstCharacter = theStringToReverse.substring(0,1);
			
			System.out.println(firstCharacter);
			
			
			reverseString(subStringPassed);
			
			
			System.out.print(firstCharacter);
		}
		
	}

}
