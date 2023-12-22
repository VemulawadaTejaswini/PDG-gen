import java.util.Scanner;

class Main{
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		long H = sc.nextLong(), N = sc.nextLong(), sum = 0;
		long[] A = new long[100005];
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextLong();
			sum += A[i];
		}
		if(sum >= H) {
			System.out.print("Yes");
		} else {
			System.out.print("No");
		}
	}
}
