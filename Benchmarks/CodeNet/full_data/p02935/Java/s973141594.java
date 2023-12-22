import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double A = 0;

		for(int i = 0 ;i < N;i++) {
			 A+=1/sc.nextDouble();
		}
		System.out.println(1/A);
	}
}