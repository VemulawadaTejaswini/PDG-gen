import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = Integer.parseInt(sc.next().trim());
		int B = Integer.parseInt(sc.next().trim());
		int K = Integer.parseInt(sc.next().trim());
		
		for (int i = 0;(i+A) <= B;i++) {
			if ((i < K) || ((i+K) > (B-A))) {
				System.out.println(i+A);
			}
		}
	}
}
