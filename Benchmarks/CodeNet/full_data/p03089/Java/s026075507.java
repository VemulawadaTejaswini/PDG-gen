import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int b[] = new int[N];
		for(int i = 0; i < N; i++) {
			b[i] = sc.nextInt();
			if(b[i] > i + 1) {
				System.out.println(-1);
				return;
			}
		}
		
		int ans[] = new int[N];
		boolean flag[] = new boolean[N];
		int ans_cnt = 0;
		int total = 0;
		int now = N - 1;
		for(int i = N - 1; i >= 0; i--) {
			if(b[i] == 1) {
				ans[ans_cnt] = 1;
				flag[i] = true;
				ans_cnt++;
				int n = 1;
				int cnt = i;
				int max = 1;
				while(cnt + total != N - 1) {
					n++;
					for(int j = i + 1; j < N; j++) {
						if(b[j] == 1) break;
						 if(b[j] > j - i + 1) {
							System.out.println(-1);
							return;
						}
					}
					for(int j = now; j >= i + 1; j--) {
						if(b[j] <= n && !flag[j]) {
							max = Math.max(max, b[j]);
							n = max;
							cnt++;
							ans[ans_cnt] = b[j];
							flag[j] = true;
							ans_cnt++;
						}
					}
					//System.out.println(total + cnt);
				}
				//System.out.println(cnt);
				total = total + cnt - i + 1;
				now = i - 1;
				//System.out.println("t");
			}
			//System.out.println(i + "t");
		}
		for(int i = 0; i < N; i++) {
			System.out.println(ans[i]);
		}
	}
}
