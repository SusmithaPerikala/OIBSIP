import java.util.*;
public class GuessNumber {
	public static void guess_num(int tot,int round)
	{
		Scanner input = new Scanner(System.in);
		int num = 1 + (int)(100 * Math.random());
		int attempts = 3,i;
		int total = tot;
		System.out.println("Welcome to the number guessing game round "+round);
		System.out.println("You have "+attempts+" attempts to guess");
		for(i = 0;i < attempts;i++)
		{
			System.out.println("Guess a number between 1 and 100:");
			int guess_num = input.nextInt();
			if(guess_num > 100 && guess_num < 1) 
				System.out.println("Please enter a valid number");
			else if(guess_num == num)
			{
				System.out.println("Yay! You guessed correct!!!");
				total += 100 -(i * 25);
				System.out.println("You got "+total+" points");
				break;
			}
			else if(guess_num > num)
			{
				System.out.println("Your guessed number is greater than the original number");
			}
			else if(guess_num < num)
			{
				System.out.println("Your guessed number is lesser than the original number");
			}
		}
		if(i == 3)
		{
			System.out.println("Sorry!! you ran out of attempts");
			System.out.println("Better luck next time!!!");
			System.out.println("The correct number is "+num);
			System.out.println("Do you want to play again? Enter Y or N:");
			char again = input.next().charAt(0);
			if(again == 'Y')
				guess_num(0,1);
			else
				System.out.println("See you next time!!!!");
		}
		else
		{
			System.out.println("Congratulations you have passed round "+round+"\n"+"Play round "+(round+1));
			System.out.println("Do you want to play next round? Enter Y or N:");
			char again = input.next().charAt(0);
			if(again == 'Y')
				guess_num(total,round+1);
			else
				System.out.println("See you next time!!!!");
		}
		input.close();
	}
	public static void main(String[] args) {
		guess_num(0,1);
	}
}