import java.util.Scanner;

public class Main {
	
	  
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()) {
			int a = in.nextInt();
			int b = in.nextInt();
			int ans = Math.max(Math.max(a+b, a-b), a*b);
			System.out.println(ans);
		}
	}
}