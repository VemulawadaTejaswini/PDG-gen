import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		String s = sc.next();
		String x = "";
		for(int i = 0; i < s.length(); i++)
		{
			if(i == k - 1)
				x += (char)(s.charAt(i) + 32);
			else
				x += s.charAt(i);
		}
		
		System.out.println(x);
	}
}
