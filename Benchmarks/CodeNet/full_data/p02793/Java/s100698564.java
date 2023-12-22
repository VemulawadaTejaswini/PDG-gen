import java.util.*;

public class Main {
	static final long MOD = 1000000007;
	
	static class Pair {
		int a, b;

		public Pair(int a, int b) {
			this.a = a;
			this.b = b;
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] A = new int[N];
		for(int i=0; i<N; i++)
			A[i] = sc.nextInt();
		
		HashMap<Integer, ArrayList<Pair>> map = new HashMap<>();
		
		for(int i=0; i<N; i++) {
			for(int j=2; j*j<=A[i]; j++) {
				if(A[i]%j==0) {
					int cnt = 0;
					while(A[i]%j==0) {
						cnt++;
						A[i]/=j;
					}
					ArrayList<Pair> list = map.get(j);
					if(list==null)
						list = new ArrayList<>();
					list.add(new Pair(i,cnt));
					map.put(j, list);
				}
			}
			if(A[i]>1) {
				ArrayList<Pair> list = map.get(A[i]);
				if(list==null)
					list = new ArrayList<>();
				list.add(new Pair(i, 1));
				map.put(A[i], list);
			}
		}
		
		long total = 1;
		long[] div = new long[N];
		Arrays.fill(div, 1);
		
		Iterator<Integer> it = map.keySet().iterator();
		while(it.hasNext()) {
			int i = it.next();
			ArrayList<Pair> list = map.get(i);
			int max = 0;
			for(Pair p : list) {
				max = Math.max(max, p.b);
			}
			
			for(Pair p : list)
				for(int j=0; j<p.b; j++)
					div[p.a] = divide(div[p.a], i);
			for(int j=0; j<max; j++)
				total = multi(total, i);
		}
		
		for(int i=0; i<N; i++)
			div[i] = multi(div[i], total);
		
		long ans = 0;
		for(int i=0; i<N; i++)
			ans = (ans + div[i]) % MOD;
		
		System.out.println(ans);
		sc.close();
	}
	
	static long multi(long a, long b) {
		return (a*b)%MOD;
	}
	
	static long divide(long a, long b) {
		return (a*rev(b)) %MOD;
	}

	static long rev(long a) {
		return pow(a, MOD-2);
	}
	
	static long pow(long a, long b) {
		long ans = 1;
		while(b>0) {
			if((b&1)!=0)
				ans = (ans * a)%MOD;
			a = (a * a)%MOD;
			b>>=1;
		}
		
		return ans;
	}

}

