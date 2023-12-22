import java.lang.reflect.Array;
import java.util.*;
import java.util.Arrays;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();	
		long distance = sc.nextInt();

		long ans = 0;
		
		long[][] dis = new long[2][N];
		
		long L = 0;
		long R = 0;
		long now_L = 0;
		long now_R = 0;
		long now_distancei = 0;
		long now_distancej = 0;
		long LR_L = 0;
		long LR_R = 0;
		
		for(int n=0;n<N;n++){
			dis[0][n] = sc.nextLong();
			dis[1][n] = sc.nextLong();
		}
		
		Arrays.sort(dis[0]);
		
		for(int i=0;i<N;i++){
			now_L += dis[1][i];
			now_distancei = dis[0][i];
			L = Math.max(now_L-now_distancei, L);
			LR_L = Math.max(now_L-now_distancei*2, LR_L);
			for(int j=N-1;i<j;j--){
				now_R += dis[1][j];
				now_distancej = distance-dis[0][j];
				if(distance==dis[0][j]+dis[0][i])
					continue;
				R = Math.max(now_R-now_distancej, R);
				LR_R = Math.max(now_R-now_distancej*2, LR_R);
				ans = Math.max(ans,Math.max(R+LR_L,L+LR_R));
			}
			R = 0;
			LR_R=0;
		}

		
		
		
		
		System.out.println(ans);
	}

}
