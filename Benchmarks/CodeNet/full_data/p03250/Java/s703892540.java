import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] A = new int[3];
		A[0] = sc.nextInt();
		A[1] = sc.nextInt();
		A[2] = sc.nextInt();
		int max = 0;
		Arrays.sort(A);
		int c = A[2]*10 + A[1];
		System.out.println(c + A[0]);
	}
}