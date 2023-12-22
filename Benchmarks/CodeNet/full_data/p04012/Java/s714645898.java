import java.util.Scanner;

public class Main {

	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] w = scan.next().split("");
		for(String s1:w) {
			int c = 0;
			for(String s2:w) {
				if(s1.equals(s2))c++;
			}
			if(c%2==1) {
				System.out.println("No");
				System.exit(0);
			}
		}
		System.out.println("Yes");
	}

}