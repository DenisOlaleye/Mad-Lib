import java.util.Scanner;

public class MadLib 
{
	public static void main (String [] args)
	{
		
		Scanner input = new Scanner(System.in);
		
		String word1;
		String word2;
		String word3;
		String word4;
		
		System.out.println("Enter 4 words of specified types: \nEnter noun >> ");
		word1 = input.nextLine();
		System.out.println("Enter another noun >> ");
		word2 = input.nextLine();
		System.out.println("Enter adjictive >> ");
		word3 = input.nextLine();
		System.out.println("Enter verb >> ");
		word4 = input.nextLine();
		
		System.out.println("Mary had a little " +word1+ "\r\n"
				+ "Its "+word2+ " was " +word3+ " as snow\r\n"
				+ "And everywhere that Mary " +word4+ "\r\n"
				+ "The " +word2+ " was sure to go.");
		
		
	}

}
