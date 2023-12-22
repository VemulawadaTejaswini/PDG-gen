import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt(), K = scn.nextInt(), S = scn.nextInt();
		int MAX = 1000000000;
		int[] ans = new int[N];
		for(int i = 0;i < N;i++) {
			if(i==0) {
				ans[0] = S-1;
				continue;
			}
			if(K>0) {
				ans[i] = (ans[i-1]==1)?S-1:1;
				K--;
			}else {
				ans[i] = MAX;
			}
		}
		printArrayLine(ans);
	}
	static void printArrayLine(int[] a) {
		int N = a.length;
		for (int i = 0; i < N; i++) {
			System.out.print(a[i] + ((i == N - 1) ? "\n" : " "));
		}
	}

}
