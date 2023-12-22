import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		
		int A[] = new int [N];

		for (int i = 0; i < A.length; i++) {
			A[i] = scan.nextInt();
		}
		
		int x = 0;
		int y = 0;
		for (int i = 0; i < N; i++) {
			if(x == 2){
				System.out.println(i+1);
				return;
			}
			y = x;
			x = A[y];
		}
		
		System.out.print(-1);
		return;
	}
}