import java.util.Scanner;

// ABC134 A - Dodecagon

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int r = Integer.parseInt(sc.nextLine());
		
		
		// Output
		int ans = (int)(3 * Math.pow(r, 2));
		System.out.println(ans);
	}
}
