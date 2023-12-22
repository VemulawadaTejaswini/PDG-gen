import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int[] A = new int[N];
		
		int[] box = new int[N];
		for(int i = 0; i < N; i ++) {
			box[i] = 0;
		}
		
		for(int i = 0; i < N; i ++) {
			A[i] = stdIn.nextInt();
			box[A[i] - 1] ++;
		}
		
		for(int k = 0; k < N; k ++) {
			long ans = 0;
			int removeNum = A[k];
			for(int i = 0; i < N; i ++) {
				if(box[i] == 0) {
					continue;
				}
				if(i == removeNum - 1) {
					ans += (box[i] - 1) * (box[i] - 2) / 2;
				}else {
					ans += (box[i]) * (box[i] - 1) / 2;
				}
			}
			System.out.println(ans);
		}
		
	}
}