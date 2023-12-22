import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] A = sc.next().toCharArray();
		char[] B = sc.next().toCharArray();
		char[] C = sc.next().toCharArray();
		if (A[A.length-1] == B[0] && B[B.length-1] == C[0])
			System.out.println("YES");
		else System.out.println("NO");
	}
}
