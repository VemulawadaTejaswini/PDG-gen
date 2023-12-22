import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[][] lrd = new int[M][3];
		int[] x = new int[N+1];
		for(int i=0;i<M;i++) {
			lrd[i][0] = sc.nextInt();
			lrd[i][1] = sc.nextInt();
			lrd[i][2] = sc.nextInt();
		}
		Arrays.sort(lrd,(a,b)-> (a[0] == b[0]) ? Integer.compare(a[1], b[1]) : Integer.compare(a[0], b[0]));

//		for(int i=0;i<M;i++) {
//			System.out.println(lrd[i][0] + " " + lrd[i][1] + " " + lrd[i][2]);
//		}

		if(M > 0) x[lrd[0][0]] = 1;
		for(int i=0;i<M;i++) {
			if(x[lrd[i][1]] == 0) {
				x[lrd[i][1]] = x[lrd[i][0]] + lrd[i][2];
			}else{
				if(x[lrd[i][1]] != x[lrd[i][0]] + lrd[i][2]) {
					System.out.println("No");
					return;
				}
			}
		}
		System.out.println("Yes");
	}

}
