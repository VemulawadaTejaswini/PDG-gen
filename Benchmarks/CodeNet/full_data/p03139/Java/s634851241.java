import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a = in.nextInt();
		int b = in.nextInt();
		
		int max = Math.min(a, b); 
		int min;
		if (a + b <= n) {
			min = 0;
		} else {
			min = a + b - n;
		}
		System.out.println(max + " " + min);
	}

}
