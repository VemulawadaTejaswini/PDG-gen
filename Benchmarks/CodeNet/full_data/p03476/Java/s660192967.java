import java.util.*;
public class Main {
	
	static int primes[];
	static int N = (int)1e5;
	
	public static void main(String[] args) {	
		
		Scanner sc = new Scanner(System.in);
		int Q = sc.nextInt();
		int sections[][] = new int[Q][2];
		for(int i=0;i<Q;i++) {
			sections[i][0] = sc.nextInt();//l
			sections[i][1] = sc.nextInt();//r
			}
		sc.close();
		
		primes = new int[N+1];
		Arrays.fill(primes, 1);
		sieve();//primesは素数の位置だけ１になっている
		
		//累積和 cumulative sum
		int cum[] = new int[N+1];
		for(int i=1;i<=N;i++) {
			if(i%2==0)cum[i]=cum[i-1];
			else {
				if(primes[i]==1&&primes[(i+1)/2]==1) {
					cum[i]=cum[i-1]+1;
				}else {
					cum[i]=cum[i-1];
				}
			}
		}
		
		int ans[] = new int[Q];
		for(int i=0;i<Q;i++) {
			int l = sections[i][0], r = sections[i][1];
			ans[i] = cum[r]-cum[l-1];
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<Q;i++) {
			sb.append(ans[i]+"\n");
		}
		System.out.println(sb.toString());
		
		
	}
	static void sieve() {
		primes[0]=primes[1]=0;
		for(int i=2;i*i<=N;i++) {
			if(primes[i]==1) {
				for(int j=i*2;j<=N;j+=i) {
					primes[j]=0;//0なら素数ではない。
				}
			}
		}
		
	}
}