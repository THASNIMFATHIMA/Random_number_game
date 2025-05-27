package practice;
import java.util.Scanner;
import java.util.Random;
class number_game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand=new Random();
		Scanner input=new Scanner(System.in);
		int randomno=rand.nextInt(10)+1;
		int points=100;
		int chance=5;
		boolean ans=true;
		System.out.println("Welcome to the game! The maximum number of attempts is 5.\n\nLet's start the game!\n");

		while(ans) {
			while(chance>0) {
				System.out.println("Enter the Random Number From 1 to 10: ");
				int number=input.nextInt();
				if(number==randomno) {
					chance=0;
					System.out.print("Your Answer is correct! Your points is: " +points +"\n");
					
				}
				else {
					points=points-20;
					chance=chance-1;
					System.out.println("Incorrect!" +chance +" chances left");
					if (number < randomno) {
			            System.out.println("Hint: Try a higher number.");
			        } else {
			            System.out.println("Hint: Try a lower number.");
			        }
				}
			}
			if(chance==0) {
				System.out.println("Do you like to play again\nyes/no");
				String check=input.next();
				if(check.equals("yes")) {
					chance=5;
					ans=true;
				}
				else {
					ans=false;
					input.close();
					System.out.println("Thanks for playing!");
				}
				
			}
		}
	}
}
