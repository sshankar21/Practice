import java.util.Scanner;

public class Practice
{

	public static void main(String[] args)
	{
		//printing
		System.out.print("I can print");
		
		//printing the value of a variable
		//integer, double,string
		//print one on  its own line
		
		String stuff = "Stuff";
		int blah = 2;
		Double meh = 9.3;
				
			System.out.print("\n" + stuff);
			System.out.print("\n" + blah);
			System.out.print("\n" + meh);
		
		Double both = meh + blah;
		blah += 30;
		meh -= 25;
		stuff += " more stuff ";
		
		System.out.print("\n"  +  both);
		System.out.print("\n" + stuff );
		System.out.print("\n" + blah );
		System.out.println("\n" + meh);
		System.out.print("blah: " +  blah + "\n" + "meh: " + meh + "\n" + "stuff: " + stuff);
		
		//create a scanner for input
		Scanner gibberish = new Scanner(System.in);
		
		//create a new string variable. prompt the user to enter favorite sport
		
		System.out.print("\nwhats your favorite sport?");
		String favsport = gibberish.nextLine();
		
		System.out.print("\n, your favorite sport is " + favsport + " and its dumb, football rules, cause thats my favorite");
				
		
		

	}

}
