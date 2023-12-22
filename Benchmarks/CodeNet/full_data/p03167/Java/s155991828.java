import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;
import java.util.StringTokenizer;

class Main {

	static long mod=(long)1e9+7;
	static int h;
	static int w;
	static long count;
	public static void main(String[] args)
	{
		FastScanner in=new FastScanner();
	    h=in.nextInt();
		w=in.nextInt();
		char[][] grid=new char[h][w];
//		int dp[][]=new int[h][w];
		count=0;
		for(int i=0;i<h;i++) {
			String x=in.next();
			for(int j=0;j<w;j++) {
				grid[i][j]=x.charAt(j);
//				System.out.println(grid[i][j]);
			}
		}
		FindPath(grid,0,0);
		
		System.out.println(count);
	}
	
	public static void FindPath(char[][] grid, int i, int j)
	{
		if(i==h-1 && j==w-1) {
//			System.out.println("Path Found");
			count=(count+1)%mod;
		}
		else
		{
//			System.out.println("Hello");
			if((i+1)<h && grid[i+1][j]!='#')
				FindPath(grid,i+1,j);
			if((j+1)<w && grid[i][j+1]!='#')
				FindPath(grid,i,j+1);
//			System.out.println(count);
		}
	}
static final Random random=new Random();
	
	static void ruffleSort(int[] a) {
		int n=a.length;//shuffle, then sort 
		for (int i=0; i<n; i++) {
			int oi=random.nextInt(n), temp=a[oi];
			a[oi]=a[i]; a[i]=temp;
		}
		Arrays.sort(a);
	}
	
	static class FastScanner {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer("");
		String next() {
			while (!st.hasMoreTokens())
				try {
					st=new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}
		
		int nextInt() {
			return Integer.parseInt(next());
		}
		int[] readArray(int n) {
			int[] a=new int[n];
			for (int i=0; i<n; i++) a[i]=nextInt();
			return a;
		}
		long nextLong() {
			return Long.parseLong(next());
		}
	}
}
