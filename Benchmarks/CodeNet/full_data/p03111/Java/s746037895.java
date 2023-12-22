import java.util.*;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int[] l = new int[N];
		int[] use = new int[N]; //n本目の棒を0=使わない、1=A,2=B,3=Cに使う
		for(int i=0;i<N;++i){
			l[i] = sc.nextInt();
			use[i] = 0;
		}
		use[N-1] = 1;

		int ans = Integer.MAX_VALUE;
		while(true){
			int la = 0;
			int lb = 0;
			int lc = 0;
			int as = 0;
			int bs = 0;
			int cs = 0;
			for(int i=0;i<N;++i){
				if(use[i]==1){
					la+=l[i];
					as++;
				}else if(use[i]==2){
					lb+=l[i];
					bs++;
				}else if(use[i]==3){
					lc+=l[i];
					cs++;
				}
			}
			if(as!=0&&bs!=0&&cs!=0){
				int res = Math.abs(la-A)+Math.abs(lb-B)+Math.abs(lc-C)+(as+bs+cs-3)*10;
				ans = Math.min(ans,res);
			}

			use[N-1]++;
			for(int i=N-1;i>0;--i){
				if(use[i]!=4) break;
				else{
					use[i] = 0;
					use[i-1]++;
				}
			}
			if(use[0] == 4) break;
		}

		System.out.println(ans);
		return;
	}
}