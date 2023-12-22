import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		Set<Integer>[] s = new Set[M];
		int[] p = new int[M];
		int ans = 0;
		int i,j,r;
		for(i = 0;i < M;i++){
			int k = sc.nextInt();
			s[i] = new HashSet<Integer>();
			for(j = 0;j < k;j++){
				s[i].add(sc.nextInt() - 1);
			}
		}
		for(i = 0;i < M;i++){
			p[i] = sc.nextInt();
		}
		for(i = 0;i < (1 << N);i++){
			boolean flg = true;
			for(j = 0;j < M;j++){
				int count = 0;
				for(r = 0;r < N;r++){
					if((1 & i >> r) == 1 && s[j].contains(r)){
						count++;
					}
				}
				if(count % 2 != p[j]){
					flg = false;
					break;
				}
			}
			if(flg){
				ans++;
			}
		}
		System.out.println(ans);
	}
}