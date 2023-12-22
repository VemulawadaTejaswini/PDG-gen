import java.util.Scanner;

public class Main {

	static  Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int n, ct = 0;
		n = in.nextInt();
		String ch;
		ch = in.next();
		
		for(int i = 0; i < n - 1; i++)
		{
			if(ch.charAt(i) == ch.charAt(i + 1))
			{
				
			}
			else
			{
				ct++;
			}
		}
		System.out.println(ct + 1);
	}

}
