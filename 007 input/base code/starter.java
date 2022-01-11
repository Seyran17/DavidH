import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
	System.out.print("What is your name? ");
	String name = sc.nextLine();
	System.out.print("What is your age? ");
	String age = sc.nextLine();
	System.out.print("What is your birth month? ");
	String birthmonth = sc.nextLine();
	System.out.print("When is your birthday? ");
	String birthday = sc.nextLine();
	System.out.print("What is your birth year? ");
	String birthyear = sc.nextLine();
	System.out.print("How much is a buck fifty? ");
	String abuckfifty = sc.nextLine();
	System.out.println("Your name is "+name);
	System.out.println("Your age is "+age);
	System.out.println("Your birth month is "+birthmonth);
	System.out.println("Your birthday is "+birthday);
	System.out.println("Your birthyear is "+birthyear);
	System.out.println("A buck fifty is "+abuckfifty);
	}
}
