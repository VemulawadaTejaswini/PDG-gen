import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[][] a = new int[M][2];
		for(int i = 0; i < M; i++) {
			a[i][0] = sc.nextInt();
			a[i][1] = sc.nextInt();
		}
		Arrays.sort(a, (x,y) -> x[0]-y[0]);
		for(int i = 0; i < M; i++) {
			if(a[i][0] == 1) {
				for(int j = 0; j < M; j++) {
					if(a[j][0] == a[i][1]) {
						if(a[j][1] == N) {
							System.out.println("POSSIBLE");
							return;
						}
					}
				}
			}
			else
				break;
		}
		System.out.println("IMPOSSIBLE");
	}

}