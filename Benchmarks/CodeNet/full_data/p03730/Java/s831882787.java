import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		String ans = a % 2 == c % 2 ? "YES" : "NO";
		System.out.println(ans);
		sc.close();
	}
}


