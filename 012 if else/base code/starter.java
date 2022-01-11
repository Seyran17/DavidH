import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		System.out.println("Choose a number between 1 and 1000");
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		int a1 = rand.nextInt(1000)+1;
		int b1 = sc.nextInt();
			System.out.println(a1);
		if(a1 == b1)
		{
			System.out.println("Correct!");
		}
		else
		{
			System.out.println("Incorrect:(");
		}
	}
}
