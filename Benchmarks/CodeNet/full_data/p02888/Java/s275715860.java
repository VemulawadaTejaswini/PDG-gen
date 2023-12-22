import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N;
		N = sc.nextInt();
		int L[] = new int[N];
		for (int i=0;i<N;i++) {
			L[i] = sc.nextInt();
		}
//		int a[][] = new int[N][N];
//		for (int i=0;i<N;i++) {
//			for (int j=i+1;j<N;j++) {
//				a[i][j] = L[i] +L[j];
//			}
//		}
		int count =0;
		for (int i=0;i<N;i++) {
			for (int j=i+1;j<N;j++) {
				for (int k=j+1;k<N;k++) {
					if (L[i]<L[j]+L[k]&&L[k]<L[j]+L[i]&&L[j]<L[i]+L[k]) {
						count ++;
					}
				}
			}
		}
		System.out.println(count);
	}
}