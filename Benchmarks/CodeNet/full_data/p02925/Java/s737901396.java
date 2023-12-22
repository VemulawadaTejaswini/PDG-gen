import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int A[][] = new int[N][N - 1];
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N - 1; j++) {
				A[i][j] = sc.nextInt() - 1;
			}
		}

		int cnt[] = new int[N];
		boolean flag[] = new boolean[N];
		Integer end[] = new Integer[N];
		Arrays.fill(end, 0);
		boolean end_f = false;
		int ans = 0;

		while(Arrays.asList(end).contains(0)) {
			for(int i = 0 ; i < N; i++) {
				if(i == 0) {
					Arrays.fill(flag, false);
					end_f = true;
					ans++;
				}
				if(flag[i]) continue;
				if(cnt[i] == N - 1) continue;
				if(A[A[i][cnt[i]]][cnt[A[i][cnt[i]]]] == i && !flag[A[i][cnt[i]]]) {
					flag[A[i][cnt[i]]] = true;
					cnt[A[i][cnt[i]]]++;
					if(cnt[A[i][cnt[i]]] == N - 1) {
						end[A[i][cnt[i]]] = 1;
					}
					flag[i] = true;
					cnt[i]++;
					end_f = false;
					if(cnt[i] == N - 1) {
						end[i] = 1;
					}
				}
				if(i == N - 1 && end_f) {
					System.out.println(-1);
					return;
				}
			}
		}
		System.out.println(ans);
	}
}
