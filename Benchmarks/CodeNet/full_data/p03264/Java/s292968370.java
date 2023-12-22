import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		sc.close();
		
		int ans = (K/2) * ((K+1)/2);
		System.out.println(ans);
	}
}
