import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Type in an integer.");
		int last = 0;
		int joe = sc.nextInt();
		int first = 0;
		int mama = sc.nextInt();
		int davidplayz = sc.nextInt();
		if(joe == mama)
		{
		System.out.println("The two numbers are the same."); 
		}
		if (joe!=mama)
		{
			System.out.println("The two numbers are different.");
		}
		  if ((joe>=mama) && (joe>=davidplayz))
 {
  first = joe;
 }

		
		 if ((mama>=joe) && (mama>=davidplayz))
 {
  first = mama;
 }

		
		 if ((davidplayz>=mama) && (davidplayz>=joe))
 {
  first = davidplayz;
 }

		System.out.println(first);
		 if ((joe<=mama) && (joe<=davidplayz))
 {
  last = joe;
 }

		if ((mama<=joe) && (mama<=davidplayz))
 {
  last = mama;
 }
		if ((davidplayz<=mama) && (davidplayz<=joe))
 {
  last = davidplayz;
 }

		System.out.println(last);
	}
}			

