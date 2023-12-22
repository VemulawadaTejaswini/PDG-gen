import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N];
		//int min = Integer.MAX_VALUE;
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		
		//int flag = -1;
		Arrays.sort(A);
		/*int max = A[N - 1];
		out : while(flag != 1) {
			max = A[N - 1];
			if(flag == -1) {
				flag = 0;
			} else {
				Arrays.sort(A);
			}
			Arrays.sort(A);
			for(int i = N - 2; i >= 0; i--) {
				if(A[N - 1] % A[i] != 0) {
					if(A[N - 1] % A[i] == 1) {
						System.out.println(1);
						return;
					}
					A[N - 1] %= A[i];
					continue out;
				}
				if(i == 0) {
					flag = 1;
				}
			}
		}*/
		for(int i = N - 1; i >= 0; i--) {
			for(int j = i - 1; j >= 0; j--) {
				if(A[i] % A[j] != 0) {
					System.out.println(1);
					return;
				}
			}
		}
		System.out.println(A[0]);
		/*int cnt = 1;
		for(int i = N - 1; i >= 0; i--) {
			for(int j = i - 1; j >= 0; j--) {
				if((A[i] - cnt) % A[j] == 0) {
					System.out.println(cnt);
					return;
				}
			}
			cnt++;
		}
		System.out.println();*/
	}
}
