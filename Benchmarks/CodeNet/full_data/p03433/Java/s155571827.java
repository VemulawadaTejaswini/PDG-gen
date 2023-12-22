import java.util.Scanner;

public class Main {
		public static void main(String[] args) {
			Scanner stdin=new Scanner(System.in);
			int n=stdin.nextInt();
			int a=stdin.nextInt();
			int amari=n%500;
			if(amari<=a)
				System.out.println("Yes");
			else
				System.out.println("No");
		}
}

