import java.util.Scanner;

public class App {
	public static void main(String[] args)
    {
        Scanner numbers = new Scanner(System.in);
        
        int secretNum = 7;
        int playAgain = 0;
        int count = 0;

        while (count++ < 5)
            {
                System.out.println("Guess a number between 1 and 10");
        
                int guess = numbers.nextInt();

                if (guess == secretNum) 
                    {
                        System.out.println("You guessed the secret number!");
                    }else
                    {
                        System.out.println("You LOST!!!! XD ");
                    }
            }
        System.out.println("You guessed the number 5 times");
    }
}
