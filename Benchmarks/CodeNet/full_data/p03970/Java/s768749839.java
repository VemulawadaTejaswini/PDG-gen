import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		String signboard = "CODEFESTIVAL2016";
		Scanner scanner = new Scanner(System.in);
		String S = scanner.nextLine();
		
		if (S.length() != signboard.length()) throw new IllegalArgumentException();
		
		int replace = 0;
		for(int i=0; i<S.length(); i++)
		{
			if (S.charAt(i) != signboard.charAt(i))
			{
				replace++;
			}
		}
		System.out.println(replace);
	}

}