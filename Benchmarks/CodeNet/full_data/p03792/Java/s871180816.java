import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		boolean[][] v = new boolean[N][N];
		for(int i=0; i<N; i++) {
			char[] s = sc.next().toCharArray();
			for(int j=0; j<N; j++)
				v[i][j] = s[j]=='#';
		}
		
		int filledColumn = 0;
		for(int i=0; i<N; i++) {
			boolean ok = true;
			for(int j=0; j<N; j++) {
				if(!v[j][i]) {
					ok = false;
					break;
				}
			}
			if(ok)
				filledColumn++;
		}
		
		int ans = Integer.MAX_VALUE;
		for(int i=0; i<N; i++) {
			boolean found = false;
			for(int j=0; j<N; j++) {
				if(v[j][i]) {
					found = true;
					break;
				}
			}
			if(found) {
				int needToPaint = 0;
				for(int j=0; j<N; j++) {
					if(!v[i][j])
						needToPaint++;
				}
				ans = Math.min(ans, needToPaint + N - filledColumn);
			}
		}
		
		System.out.println(ans<Integer.MAX_VALUE ? ans : -1);
		sc.close();
	}
}

