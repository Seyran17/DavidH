import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Are you a Wizard, Warrior, or a Rogue");
		String a1 = sc.nextLine();
		boolean yoMama = ((a1.equals("Wizard")) || (a1.equals("Warrior"))|| (a1.equals("Rogue"))|| (a1.equals("wizard"))|| (a1.equals("warrior"))|| (a1.equals("rogue")));
		if(yoMama)
		{
			System.out.println("Your class is "+a1);
			
		}
		else
		{
			System.out.println("You are wrong");
		}
		
	}
}
