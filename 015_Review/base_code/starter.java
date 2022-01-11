import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		int Strength;
		int Dexterity;
		int Intelligence;
		int Constitution;
		int Charisma;
		Scanner sc = new Scanner(System.in);
		System.out.println("Are you a Wizard, Warrior, or a Rogue");
		String a1 = sc.nextLine();
		boolean yoMama = ((a1.equals("Wizard")) || (a1.equals("Warrior"))|| (a1.equals("Rogue"))|| (a1.equals("wizard"))|| (a1.equals("warrior"))|| (a1.equals("rogue")));
		if(yoMama)
		{System.out.println("Your class is "+a1);}
		
		else
		{
		System.out.println("You are wrong");
		}
		System.out.println("What is your character name?");
		String c3 = sc.nextLine();
		System.out.println("Your Characters name is " + c3);
		System.out.println("What is your title?");
		String title = sc.nextLine();
		System.out.println("Your title is "+title);
	int sp = 25;
	System.out.println("Choose your traits, you have 25 points. The max you can put in each skillpoint is 10.");
		
			int z1 = 0;
			if (sp!=0)
			{
			System.out.println("Put in the amount of Strength you want");
			z1 = sc.nextInt();
			if((z1<=sp) && (z1<=10))
			{
			Strength = z1;
			sp = sp-z1;
			System.out.println("you have "+sp+" skillpoints remaining");
			}
			else
			{
			System.out.println("bruh no cheating, cheating is not cool");
			}
				
			}	
			int y1 = 0;
			if (sp!=0) 
			{
			System.out.println("Put in the amount of Dexterity you want");
			y1 = sc.nextInt();
			if((y1<=sp) && (y1<=10))
			{
			Dexterity = y1;
			sp = sp-y1;
			System.out.println("you have "+sp+" skillpoints remaining");
			}
			else
			{
			System.out.println("bruh no cheating, cheating is not cool");
			}
			}
			int x1 = 0;
			if (sp!=0) {
			System.out.println("Put in the amount of Intelligence you want");
			x1 = sc.nextInt();
			if((x1<=sp) && (x1<=10))
			{
			Intelligence = x1;
			sp = sp-x1;
			System.out.println("you have "+sp+" skillpoints remaining");
			}
			else
			{
			System.out.println("bruh no cheating, cheating is not cool");
			}
			}
			int w1 = 0;
			if (sp!=0) {
			System.out.println("Put in the amount of Constitution you want");
			w1 = sc.nextInt();
			if((w1<=sp) && (w1<=10))
			{
			Constitution = w1;
			sp = sp-w1;
			System.out.println("you have "+sp+" skillpoints remaining");
			}
			else
			{
			System.out.println("bruh no cheating, cheating is not cool");
			}
			}
			int v1 = 0;
			if (sp!=0) {
			System.out.println("Put in the amount of Charisma you want");
			v1 = sc.nextInt();
			if((v1<=sp) && (v1<=10))
			{
			Charisma = v1;
			sp = sp-v1;
			System.out.println("you have "+sp+" skillpoints remaining");
			}
			else
			{
			System.out.println("bruh no cheating, cheating is not cool");
			}
			}
			System.out.println("You have "+sp+" skillpoints leftover");
			System.out.println("Your name is "+c3+" and your title is "+title);
			System.out.println("Here are your stats:");
			System.out.println("Strength: " + z1);
			System.out.println("Dexterity: " + y1);
			System.out.println("Intelligence: " + x1);
			System.out.println("Constitution: " + w1);
			System.out.println("Charisma: " + v1);
		}
}