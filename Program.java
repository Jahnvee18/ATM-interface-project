import java.util.Scanner;
public class Program{
	public static void
	guessingNumberGame()
	{
		int i, guess;
		Scanner sc = new Scanner(System.in);
		int number = 1+(int)(100*Math.random());
		int K = 6;
		
		System.out.println(
				"A number is chosen"
				+"between 1 to 100."
				+"Guess the number"
				+"within 6 trials.");
		for(i=0 ; i<K ; i++) {
			System.out.println(
					"Guess the number:");
			guess = sc.nextInt();
			if (number==guess) {
				System.out.println(
						"Congratulations!"+
						"You got it." );
				break;
			}
			else if ((number>guess && (i!=K-1)))
				{
				System.out.println(
						"The number is"
						+ "greater than" +guess);
			}
		else if ((number<guess
		&& (i!=K-1 ))) {
			System.out.println("The number is"+ "less than" +guess);
		}
}
		if (i==K){
			System.out.println(" Oops!Better luck next time.");
			System.out.println("The number was"+number);
		
                }}
		public static void main (String args[])
		{
			guessingNumberGame();
		}
	}

		
	