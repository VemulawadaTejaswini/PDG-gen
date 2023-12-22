import java.util.Scanner;

public class Main {

	static int ansA;
	static int ansB;
	static int N;


	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		String S = sc.next();

		char a[] = new char[N];
		for (int i = 0; i < N; i++) {
			a[i] = S.charAt(i);
		}
		dfs(a,0,0);
		dfs2(a,N-1,0);
		int ans = Math.min(ansA, ansB);
		System.out.println(ans);
	}


	static void dfs(char a[],int i,int cnt) {
		if (i==N-1) {
			return;
		}
		if (a[i] == '#') {
			cnt++;
			if (a[i+1] == '.') {
				ansA += cnt;
				cnt =0;
			}
		}
		i++;
		dfs(a,i,cnt);
	}

	static void dfs2(char a[],int i,int cnt) {
		if (i==0) {
			return;
		}
		if (a[i] == '.') {
			cnt++;
			if (a[i-1] == '#') {
				ansB += cnt;
				cnt =0;
			}
		}
		i--;
		dfs2(a,i,cnt);
	}

}
