import java.util.Scanner;

public class Game {
	
   public static String mysteryWord;
   public static int maxTest = 10;
   public static int totalPoint = 500;
   public static String letter;
   public static boolean foundWord;
   
   public static String inputMysteryWord () {
	Scanner word = new Scanner(System.in);
	System.out.println("Entrer le mot inconnu : ");
	mysteryWord = word.nextLine();
	return mysteryWord;
	
}
   public static String test () {
	   Scanner inputLetter = new Scanner(System.in);
	   System.out.println("Entrer une lettre :\n Vous avez encore " + maxTest + "essais");
	   while (maxTest <= 10) {
		   maxTest--;
		   totalPoint--;
	   }
	   letter = inputLetter.nextLine();
	   return letter;
   }
	public static void main(String[] args) {
		inputMysteryWord();
        test();
	}

}

