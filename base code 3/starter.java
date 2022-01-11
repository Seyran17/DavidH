import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int a1 = sc.nextInt();
		int a2 = sc.nextInt();
		int nigeria = a1*a2;
		System.out.println(nigeria);
		int poopies = (nigeria/3);
				if (nigeria!=0)
			{
			System.out.println("Your number is not divisable by 3");
			}
			else
			{
			System.out.print("Your number is divisable by 3");
			}
		}
	}
