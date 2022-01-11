import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		int a1 = rand.nextInt(1000)+1;
		//
		System.out.println("Choose a number between 1 and 1000");
		//
		while(true)
		{
			int b1 = sc.nextInt();
				if(a1 == b1)
				{
				System.out.println("correct!");
				break;
				}
				//
				else if (a1>b1)
				{
				System.out.println("Your guess was too low");
				}
				//
				else if (b1>a1)
				{
				System.out.println("Your guess was too high");
				}
		}
	}
	}


