import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		int[] buf = new int[N];
		int count;
		int ans = 0;
		int i;
		for(i = 0;i < N;i++){
			A[i] = sc.nextInt();
		}
		for(i = 0;i < N;i++){
			count = 1;
			System.arraycopy(A,0,buf,0,A.length);
			buf[i] = 0;
			Arrays.sort(buf);
			for(int k = 0;k < N;k++){
				if(k == N - 1){
					if(count != 1){
						ans += comb(count,2);
						count = 1;
					}
				}
				else if(count != 1 && buf[k] != buf[k+1]){
					ans += comb(count,2);
					count = 1;
				}else if(buf[k] == buf[k+1]){
					count++;
				}
			}
			System.out.println(ans);
			ans = 0;
		}
	}
	public static int comb(int n,int m){
		int buf = 1;
		int buf2 = 1;
		int buf3 = 1;
		int N = n;
		int M = m;
		int M2 = m;
		while(N > 0){
			buf *= N;
			N--;
		}
		while(M > 0){
			buf2 *= M;
			M--;
		}
		while((n - M2) > 0){
			buf3 *= (n - M2);
			M2++;
		}
		return buf / (buf2 * buf3);
	}
	
}