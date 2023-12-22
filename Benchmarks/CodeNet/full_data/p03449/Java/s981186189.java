
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[][] = new int[2][N];
		for (int i=0;i<2;i++) {
			for (int j=0;j<N;j++) {
				A[i][j] = sc.nextInt();
			}
		}
		int sum2 =0;
		for (int i=0;i<N;i++) {
			sum2+=A[1][i];
		}
		int max=0;
		int sum =0;
		for (int i=0;i<N;i++) {
			sum +=A[0][i];
			int temp=sum+sum2;
			sum2-=A[1][i];
			if (max<temp) {
				max = temp;
			}
		}
		System.out.println(max);
	}

}