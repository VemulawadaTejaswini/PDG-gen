import java.io.*;
import java.util.*;
import java.lang.*;


public class Main
{
	public static void main(String args[]) throws java.lang.Exception,FileNotFoundException
	{
		Scanner sc = new Scanner(System.in);

		// PrintStream obj = new PrintStream(new File("Output.txt"));
		// System.setOut(obj);

		int N = sc.nextInt();
		int K = sc.nextInt();

		String S = sc.next();

		K = K - 1;

		Character c = S.charAt(K);

		char temp = Character.toLowerCase(c);

		S = S.replace(S.charAt(K), temp);

		System.out.println(S);
		
		sc.close();
		System.out.flush();
	}
}