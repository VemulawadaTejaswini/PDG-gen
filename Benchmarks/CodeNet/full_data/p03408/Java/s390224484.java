import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.StringTokenizer;

class Main{

	static class FastReader {

		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}

	static int mod = 1000000007;

	public static void main(String[] args) throws IOException {
		FastReader sc = new FastReader();
		// codeChefQ2(sc);
		// codeChefQ3(sc);
		// codeChef4(sc);
		// codechef6(sc);
//		codechef7(sc);
		int n=sc.nextInt();
		HashMap<String, Integer> mp =new HashMap<>();
		for(int i=0;i<n;i++){
			String ss=sc.next();
			if(mp.containsKey(ss))
				mp.put(ss, mp.get(ss)+1);
			else 
				mp.put(ss,1);
		}
		int m=sc.nextInt();
		for(int i=0;i<m;i++){
			String ss=sc.next();
			if(mp.containsKey(ss))
				mp.put(ss, mp.get(ss)-1);
			else 
				mp.put(ss,1);
		}
		int ans=0;
		Set<String> set =mp.keySet();
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()){
			String key =itr.next();
			int val =mp.get(key);
			if(val>ans)ans=val;
		}
		
		System.out.println(ans);

	}
	
	private static void codechef7(FastReader sc) {
		int n = sc.nextInt(), q = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		while (q-- > 0) {
			int type = sc.nextInt(), l = sc.nextInt(), r = sc.nextInt();
			if (type == 1)
				arr[l - 1] = r;
			else {
				ArrayList<Integer> aa = new ArrayList<>();
				for (int i = l - 1; i < r; i++)
					aa.add(arr[i]);
				Collections.sort(aa);
				// System.out.println(aa);
				if(aa.size()<3)
					System.out.println(0);
				else if (aa.size() == 3) {
					if ((aa.get(0) + aa.get(1) > aa.get(2)))
						System.out.println(aa.get(0) + aa.get(1) + aa.get(2));
					else
						System.out.println(0);
				} else {
					boolean f1 = false, f2 = false;
					long val = 0;
					for (int i = aa.size() - 1; i >= 0; --i) {
						for (int j = i - 1; j >= 0; --j) {
							for (int k = j - 1; k >= 0; --k) {
								if (i != j && j != k && i != k && (aa.get(i) < aa.get(j) + aa.get(k))) {
									val = aa.get(i) + aa.get(j) + aa.get(k);
									f1=true;
									break;
								}
 
							}
							if(f1){
								f2=true;
								break;
							}
 
						}
						if(f1) break;
					}
					System.out.println(val);
				}
			}
		}
	}
	
	private static void codechef6(FastReader sc) {
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			long[] ss = new long[n];
			long sum=0;
			int[] arr = new int[n], vot = new int[n];
			for (int i = 0; i < n; i++){
				arr[i] = sc.nextInt();
				sum+=arr[i];
				ss[i]=sum;
				}
			long ans=0;
			for (int i = 0; i < n; i++) {
				ans=0;
				for(int j=i-1;j>=0;j--){
					if(ans<=arr[i])vot[j]++;
					else break;
					ans+=arr[j];
				}
				ans=0;
				for(int j=i+1;j<n;j++){
					if(ans<=arr[i])vot[j]++;
					else break;
					ans+=arr[j];
				}
				
			}
			for (int i = 0; i < n; i++)
				System.out.print(vot[i] + " ");
			System.out.println();
		}
	}

	private static long[][] matrix_pow(long[][] mat, int e) {
		long[][] ans = new long[2][2];
		for (int i = 0; i < mat.length; i++)
			ans[i][i] = 1;
		while (e > 0) {
			if ((e & 1) == 1)
				ans = mult(ans, mat);
			mat = mult(mat, mat);
			e >>= 1;
		}

		return ans;
	}

	private static long[][] mult(long[][] a, long[][] b) {
		int n = a.length;
		int m = a[0].length;
		int k = b[0].length;
		long[][] res = new long[n][k];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < k; j++) {
				for (int p = 0; p < m; p++) {
					res[i][j] = (res[i][j] + (a[i][p] * b[p][j]) % mod) % mod;
				}
			}
		}
		return res;
	}

	private static void codeChef4(FastReader sc) {
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt(), h = sc.nextInt();
			int[] arr = new int[n];
			long min=1,max=0,ans=0;;
			for(int i=0;i<n;i++){
				arr[i]=sc.nextInt();
				max+=arr[i];
			}
			while(min<=max){
				long mid=(min+max)>>1;
			if(func(mid,arr,h)){
				ans=mid;
				max=mid-1;
			} else
				min=mid+1;
			}
			System.out.println(ans);
		}
	}

	private static boolean func(long mid, int[] arr, int h) {
		long ans=0;
		for(int i=0;i<arr.length;i++)ans+=(arr[i]+mid-1)/mid;
		return ans<=h;
	}

	private static void codeChefQ3(FastReader sc) {
		int t = sc.nextInt();
		while (t-- > 0) {
			java.util.HashMap<Integer, Integer> mp = new java.util.HashMap<>();
			int n = sc.nextInt();
			ArrayList<Integer> aa = new ArrayList<>();
			long ans = 0;
			for (int i = 0; i < n; i++) {
				int val = sc.nextInt();
				if (!mp.containsKey(val)) {
					mp.put(val, 1);
					aa.add(val);
				} else {
					int ind = aa.size() - 1;
					while (true && ind >= 0) {
						int num = val + aa.get(ind);
						if (!mp.containsKey(num)) {
							mp.put(num, 1);
							aa.add(num);
							ans++;
							break;
						} else
							ind--;
					}
					ind = aa.size() - 1;
				}
			}

			System.out.println(ans);
		}
	}

	private static void codeChefQ2(FastReader sc) {
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			double ans = 0;
			for (int i = 0; i < n; i++) {
				double p = sc.nextDouble(), q = sc.nextDouble(), d = sc.nextDouble(), new_p, leftP;
				new_p = p;
				p = p + (p * d / 100);
				p = p - (p * d / 100);
				// System.out.println(" "+leftP);
				ans += ((new_p - p) * q);
			}
			System.out.printf("%.6f", ans);
			System.out.println();
		}

	}
}
