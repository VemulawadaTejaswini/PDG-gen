import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int K = sc.nextInt();
		System.out.println((int)(A + B + C + Math.max(A,Math.max(B,C))*(Math.pow(2,K) -1)));
	}

}
