

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main{
	static long memo[][];
	static int n;
	static int m;
	static char[][]a;
	static long dp(int k,int l) {
	for(int i=1;i<n;i++) {
		for(int j=1;j<m;j++) {
			if(a[i][j]=='#')memo[i][j]=0;
			else
			memo[i][j]=memo[i-1][j]%(1000000000+7)+memo[i][j-1]%(1000000000+7);
		}
	}
	return memo[n-1][m-1]%(1000000000+7);
   
    }
    
	public static void main(String []args) throws IOException {
 		PrintWriter pw =new PrintWriter(System.out);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st =new StringTokenizer(br.readLine());
		 n=Integer.parseInt(st.nextToken());
	     m=Integer.parseInt(st.nextToken()); 
		memo=new long [n][m];
		a=new char[n][m];
		for(int i=0;i<n;i++) {
			StringBuilder sb=new StringBuilder(br.readLine());
			for(int j=0;j<m;j++)a[i][j]=sb.charAt(j);
		}int pos1=n,pos2=m;
		for(int i=0;i<n;i++)if(a[i][0]=='#'){memo[i][0]=0;pos1=i;break;}else memo[i][0]=1;
		for(int i=pos1+1;i<n;i++)memo[i][0]=0;
		for(int i=0;i<m;i++)if(a[0][i]=='#'){memo[0][i]=0;pos2=i;break;}else memo[0][i]=1;
		for(int i=pos2+1;i<m;i++)memo[0][i]=0;
		pw.println(dp(1,1));
        pw.flush();
}
}