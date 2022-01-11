import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Random rand = new Random();
	int a1 = rand.nextInt(10);
		System.out.println(a1); 
	int a2 = rand.nextInt(100)+1;
		System.out.println(a2); 
	double a3 = rand.nextDouble()+2.5;
	    System.out.println(a3);
	int a4 = rand.nextInt(575)+14;
	    System.out.println(a4);
	}
}
