import java.util.*;

public class Main {
	static class Range {
		int size;
		long lv, rv;
		public Range(int size, long lv, long rv) {
			this.size = size;
			this.lv = lv;
			this.rv = rv;
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		long[] A = new long[N];
		for(int i=0; i<N; i++)
			A[i] = sc.nextLong();
		System.out.println(solve1(N,A));
//		System.out.println(solve2(N,A));
		
		sc.close();
	}
	
	
	public static int[] dp1(long[] A) {
		int N = A.length;
		int[] ans = new int[N+1];
		
		LinkedList<Range> list = new LinkedList<>();
		ans[N] = 0;
		for(int i=N-1; i>=0; i--) {
			ans[i] = ans[i+1];
			list.push(new Range(1, A[i], A[i]));
			
			while(list.size() > 1) {
				Range cur = list.pop();
				if(cur.rv <= list.peek().lv) {
					list.push(cur);
					break;
				}
				Range next = list.pop();
				while(cur.rv > next.lv) {
					next.lv *= 4;
					next.rv *= 4;
					ans[i] += 2*next.size;
				}
				cur.size += next.size;
				cur.rv = next.rv;
				list.push(cur);
			}
		}

		return ans;
	}
	
	public static long solve1(int N, long[] A){
		int[][] dp = new int[2][];
		
		dp[0] = dp1(A);
		long[] B = new long[A.length];
		for(int i=0; i<N; i++)
			B[i] = A[N-1-i];
		dp[1] = dp1(B);
		
		int ans = Integer.MAX_VALUE;
		for(int i=0; i<=N; i++)
			ans = Math.min(ans, dp[0][i]+dp[1][N-i]+i);
		
		return ans;
	}
	
	public static long solve2(int n, long[] a){
		
		long[] suf=dp(a);
		
		long[] b=new long[n];
		for(int i=0;i<n;i++){
			b[i]=a[n-i-1];
		}
		long[] pre2=dp(b);
		long[] pre=new long[n];
		for(int i=0;i<n;i++){
			pre[i]=pre2[n-1-i];
		}
		//pl(Arrays.toString(pre));
		long res=Long.MAX_VALUE;
		int tantyo=0;
		for(int i=0;i<n;i++){
			if(i>0){
				if(a[i]>=a[i-1]) tantyo++;
				else tantyo=0;
			}
			//pl(tantyo);
			long temp=i-tantyo;
			temp+=(i>0)?pre[i-1]*2:0;
			temp+=suf[i]*2;
			res=Math.min(res,temp);
			
		}
		return res;
	}
	static void pl(Object o){
		System.out.println(o);
	}
	static long[] dp(long[] a){
		int n=a.length;
		long[] res=new long[n];
		
		int[] stack=new int[10000000];
		int size=0;
		
		for(int i=n-2;i>=0;i--){
			int kaisu=0;
			long p=a[i+1];
			long temp=0;
			while(a[i]>p){
				p*=4;
				kaisu++;
			}
			if(kaisu>0){
				//pl(Arrays.toString(Arrays.copyOf(stack,10)));
				while(kaisu>0){
					int ind=(size>0)?stack[--size]:n-1;
					temp+=ind-i;
					kaisu--;
				}
				
			}else{
				int kosu=0;
				long p2=a[i];
				while(p2<=a[i+1]){
					p2*=4;
					kosu++;
				}
				kosu--;
				for(int j=0;j<kosu;j++) stack[size++]=i;
			}
			res[i]=res[i+1]+temp;
		}
		//pl(Arrays.toString(res));
		return res;
	}
}