
import java.util.*;



import java.io.*;
public class Main {


	public static void main(String[] args) {
	FastScanner sc=new FastScanner();
    String s=sc.next(),t=sc.next();
    int n=s.length(),m=t.length();
    int dp[][]=new int[s.length()+1][t.length()+1];
    for(int i=0;i<=n;i++) {
    	for(int j=0;j<=m;j++) {
    		if(i==0||j==0)
    			dp[i][j]=0;
    		else {
				if(s.charAt(i-1)==t.charAt(j-1))
					dp[i][j]=dp[i-1][j-1]+1;
				else dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
    			
			}
    	}
    }
    int idx=dp[n][m];
    int  t1=idx;
   // System.out.println(t1);
    char lcs[]=new char[idx+1];
    lcs[idx]=' ';
    int  i=n;
    
    int j=m;
    while(i>0&&j>0){
        if(s.charAt(i-1)==t.charAt(j-1)){
             lcs[idx-1]=s.charAt(i-1);
            i--;
            j--;
            idx--;
           
            
        }
        else if(dp[i-1][j]>dp[i][j-1])
        i--;
        else
        j--;
    }
    for(int k=0;k<=t1;k++){
        System.out.print(lcs[k]);
    }
    System.out.println();


	}
	static class FastScanner{
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
		long nextLong() {
			return Long.parseLong(next());
		}
		int [] readArray(int n) {
			int a[]=new int[n];
			for(int i=0;i<n;i++) a[i]=nextInt();
			return a;
		}
		
		
	}
	

}

