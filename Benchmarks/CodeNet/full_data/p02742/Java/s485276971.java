import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long h = sc.nextLong();
		long w = sc.nextLong();
		
		Long ans = ((h - h / 2) * (w - w / 2)) + ((h / 2) * (w / 2));
		System.out.println(ans);
		
		sc.close();
	}
}
