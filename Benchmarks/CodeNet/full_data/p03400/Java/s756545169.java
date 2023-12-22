import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int D = sc.nextInt();
		int X = sc.nextInt();
		int[] A = new int[N];
		for(int i = 0 ; i < N; i++) {
			A[i] = sc.nextInt();
		}
		int eatNum = 0;
		for(int i = 0; i < N; i++) {
			int tmp = A[i];
			int day = 1;
			while(true) {
				if(day <= D) {
					eatNum++;
					day += A[i];
				} else {
					break;
				}
			}
		}
		System.out.println(X+eatNum);
	}
}