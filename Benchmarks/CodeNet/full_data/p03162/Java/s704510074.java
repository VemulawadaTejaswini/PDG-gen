import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;
import java.util.StringTokenizer;

class Solution {
	public static void main(String[] args)
	{
		FastScanner in=new FastScanner();
		int N=in.nextInt();
		int[][] arr=new int[N][3];
		int ans=0;
		for(int i=0;i<N;i++)
		{
			arr[i][0]=in.nextInt();
			arr[i][1]=in.nextInt();
			arr[i][2]=in.nextInt();		
		}
		for(int j=0;j<2;j++)
			for(int k=0;k<2;k++)
				for(int l=0;l<2;l++) {
					int x=j,y=k,z=l;
					int max=0;
					for(int i=0;i<N;i++)
					{
						int index=FindMaxIndex(arr,i,x,y,z);
//						System.out.println(x+" "+y+" "+z);
						if(index!=-1)
						max+=arr[i][index];
						if(index==0) {
							x++;
							y=0;
							z=0;
						}
						if(index==1) {
							y++;
							x=0;
							z=0;
						}
						if(index==2) {
							z++;
							x=0;
							y=0;
						}
					}
//					System.out.println(max);
					ans=Math.max(ans, max);
				}
		System.out.println(ans);
	}
	public static int FindMaxIndex(int[][] arr, int i, int x,int y,int z)
	{
		if(x==1 && y==1 && z==1)
			return -1;
		if(x==1 && y==1)
			return 2;
		if(y==1 && z==1)
			return 0;
		if(z==1 && x==1)
			return 1;
		if(x==1)
			return (arr[i][1]>arr[i][2])?1:2;
		if(y==1)
			return (arr[i][0]>arr[i][2])?0:2;
		if(z==1)
			return (arr[i][1]>arr[i][0])?1:0;
		return (arr[i][0]>arr[i][1])?((arr[i][0]>arr[i][2])?0:2):((arr[i][1]>arr[i][2])?1:2);
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
