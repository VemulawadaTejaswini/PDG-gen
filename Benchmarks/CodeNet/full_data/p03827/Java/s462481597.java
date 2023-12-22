import java.util.Scanner;

public class Main {

	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String[] s = scan.next().split("");
		int max=0;
		int x = 0;
		for(int i=0; i<n; i++) {
			x += s[i].equals("I") ? 1 : -1;
			max = Math.max(x, max);
		}
		System.out.println(max);
	}

}