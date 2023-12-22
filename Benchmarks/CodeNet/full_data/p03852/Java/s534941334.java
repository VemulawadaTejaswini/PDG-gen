import java.util.Scanner;

public class Main{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		String a=sc.next();
		String ans;

		if (a.equals("a") || a.equals("o") || a.equals("i") || a.equals("e") || a.equals("u")) ans="vowel";
		else ans="consonant";
		
		System.out.println(ans);	
	}
	
} 