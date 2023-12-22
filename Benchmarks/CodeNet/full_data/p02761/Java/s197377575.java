import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] c = new int[N];
		int[] flg = new int[N];
		int[] bufn = new int[N];
		int i,s,j,dust;
		int buf;
		int ans = -1;
		int flg2 = 0;
		for(i = 0;i < M;i++){
			s = sc.nextInt();
			c[s-1] = sc.nextInt();
			if(flg[s-1] == 0){
				bufn[s-1] = c[s-1];
				flg[s-1] = 1;
			}else if(bufn[s-1] != c[s-1]){
				flg2 = 1;
			}
		}
		if(flg2 == 0 && c[0] != 0){
			ans = 0;
			for(i = 0;i < N;i++){
				buf = 1;
				for(j = 0;j < i;j++){
					buf *= 10;
				}
				ans += (c[N-1-i] * buf);
				if(i == (N-1) && c[0] == 0){
					ans += buf;
				}
			}
		}
		System.out.println(ans);
	}
}