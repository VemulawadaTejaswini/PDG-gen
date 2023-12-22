import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Long l = 1L;
		for(int i = 1; i <= n; i++) {
			l=l*i%1000000007;
		}
		System.out.println(l);
	}
}