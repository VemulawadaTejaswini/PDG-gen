
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int a[][] = new int[N][2];
		for (int j = 0; j < 2; j++) {
			for (int i = 0; i < N; i++) {
				a[i][j] = in.nextInt();
			}
		}
		
		int max=0;
		int sum=0;
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<=i;j++) {
				sum=a[j][0]+sum;
			}
			for(int j=i;j<N;j++) {
				sum=a[j][1]+sum;
			}
			max=Math.max(max, sum);
			sum=0;
		}
		
		System.out.println(max);
		
	}
}

