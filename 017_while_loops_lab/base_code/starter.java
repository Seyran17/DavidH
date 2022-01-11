import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {	
		Scanner sc = new Scanner(System.in);
	System.out.println("Please type what you would like to be repeated");
	String a1 = sc.nextLine();
	System.out.println("You chose "+a1+" to be repeated");
	System.out.println("Choose how many times you want it to be repeated");
	int a2 = sc.nextInt();
	System.out.println("You chose for it to be repeated "+a2+" amount of times");
	int count = 0;
	//No way Jose
		while(true)
		{
			System.out.print(a1);
			if(count == a2)
			{
				break;
			}
			count = count + 1;
		}
	}
}
