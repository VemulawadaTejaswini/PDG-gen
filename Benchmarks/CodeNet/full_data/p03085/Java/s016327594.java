import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
	public static void main(String[] Arguments) throws IOException 
	{
		BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
		char C = BR.readLine().charAt(0);
		switch (C)
		{
		case 'A':
			System.out.println("T");
			break;
		case 'T':
			System.out.println("A");
			break;
		case 'C':
			System.out.println("G");
			break;
		case 'G':
			System.out.println("C");
			break;
		}
	}
}
