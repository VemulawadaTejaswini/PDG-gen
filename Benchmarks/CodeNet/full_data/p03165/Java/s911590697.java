

import java.io.*;

import java.util.*;



public class Main {
   static int dp[][];static int n,m;
   static char[] x,y;
   static PrintWriter pw = new PrintWriter(System.out);
	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
        x=sc.next().toCharArray();
        y=sc.next().toCharArray();
        n=x.length+1;
        m=y.length+1;
		dp=new int[x.length+1][y.length+1];
		for(int i=0;i<n;i++) {
				dp[i][0]=0;
		}
		for(int i=0;i<m;i++) {
			dp[0][i]=0;
		}
		for(int i=1;i<n;i++) {
			for(int j=1;j<m;j++) {
				if(x[i-1]==y[j-1]) {
					dp[i][j]=1+dp[i-1][j-1];
				}
				else dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
			}
		}
		int i=n-1;
		int j=m-1;
		StringBuilder sb=new StringBuilder();
		while(i>0&&j>0){
			if(dp[i][j]==dp[i-1][j-1]+1) {
				sb.append(x[i-1]);
				i--;
				j--;
			}
			else if(dp[i][j]==dp[i-1][j])i--;
			else j--;
		}
		pw.println(sb.reverse());
        //pw.println(dp[n-1][m-1]);
		pw.close();

	}
	public static int solve(int i,int j,int v) {
		if(i==n||j==m)return dp[i][j][v]=0;
		int take=0;
		int leave=0;
		if(v==0) {
	}
public static boolean prime(int x){
	    int[] arr=new int[10000000];
	    int index=0;
	    int num=3;
	    int i=0;
	    arr[0]=2;
	    while(num<=x){
	      for(i=0;i<=index;i++){
	          if(num%arr[i]==0){
	              break;
	          }
	      }
	      if(i==index+1){
	          arr[++index]=num;
	      }
	      num++;
	    }
	    if(arr[index]==x)return true;
	    return false;
	      
	}
public static void conquer(int[] arr,int b,int m,int e){
	    int len1=m-b+1;
	    int len2=e-m;
	    int[] l=new int[len1];
	    int[] r=new int[len2];
	    for(int i=0;i<len1;i++){
	        l[i]=arr[b+i];
	    }
	   for(int j=0;j<len2;j++){
	            r[j]=arr[m+1+j];
	   }
	    int i=0,j=0,k=b;
	    while((i<len1)&&(j<len2)){
	        if(r[j]>=l[i]){
	            arr[k]=l[i];
	            k++;
	            i++;
	        }
	        else{
	           arr[k]=r[j];
	           k++;
	           j++;
	        }
	    }
	    while(i<len1){
	        arr[k++]=l[i++];
	    }
	    while(j<len2){
	        arr[k++]=r[j++];
	    }
	}
	static int mid;
	public static void sort(int[] arr,int b,int e){
	    if(b<e){
	        int mid =(e+b)/2;
	        sort(arr,b,mid);
	        sort(arr,mid+1,e);
	        conquer(arr,b,mid,e);
	    }
	}
    public static void Sort(int[] arr){
        sort(arr,0,arr.length-1);
    }

	static class Scanner {

		StringTokenizer st;

		BufferedReader br;



		public Scanner(InputStream s) {

			br = new BufferedReader(new InputStreamReader(s));

		}



		public Scanner(String file) throws FileNotFoundException {

			br = new BufferedReader(new FileReader(file));

		}



		public String next() throws IOException {

			while (st == null || !st.hasMoreTokens())

				st = new StringTokenizer(br.readLine());

			return st.nextToken();

		}



		public int nextInt() throws IOException {

			return Integer.parseInt(next());

		}



		public long nextLong() throws IOException {

			return Long.parseLong(next());

		}



		public String nextLine() throws IOException {

			return br.readLine();

		}



		public double nextDouble() throws IOException {

			return Double.parseDouble(next());

		}



		public boolean ready() throws IOException {

			return br.ready();

		}



	}

}

