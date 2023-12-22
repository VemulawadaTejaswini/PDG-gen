import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int ans = n * 800;
		ans-= 200 * (n/15);
		
		System.out.println(ans);
	}
}