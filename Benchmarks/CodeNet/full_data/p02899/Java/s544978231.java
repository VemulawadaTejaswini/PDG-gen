import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		
		for (int i=1; i<=N; i++) {
			A[sc.nextInt()-1] = i;
		}
		for (int a : A) {
			System.out.println(a + " ");
		}
	}
}