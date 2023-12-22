import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int temp = 0;
		if(N % (A + B) > A) {
			temp = A;
		} else {
			temp = N % (A + B);
		}
		System.out.println(A * (N / (A + B)) + temp);
	}
}
