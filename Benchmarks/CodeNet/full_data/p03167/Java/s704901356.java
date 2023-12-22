//Grid1
import java.io.*;
import java.util.*;
public class Main{
static int n,m;
static int mod=(int)1e9+7;
static char[][] path;
static int[] b=new int[10005];
public static long solve(){
	long[][] dp=new long[n][m];	
	for(int i=0;i<n;i++){
		if(path[i][0]=='.'){ dp[i][0]=1;}
		else break;
	}
	for(int i=0;i<m;i++){
		if(path[0][i]=='.'){ dp[0][i]=1;}
		else break;
	}
	for(int i=1;i<n;i++){
		for(int j=1;j<m;j++){			
			if(path[i][j]=='#'){
				dp[i][j]=-1;
			}
			else{
				if(dp[i-1][j]!=-1&&dp[i][j-1]!=-1){
					dp[i][j]=(dp[i-1][j]+dp[i][j-1])%mod;
				}
				else if(dp[i-1][j]!=-1){
					dp[i][j]=dp[i-1][j]%mod;
				}
				else if(dp[i][j-1]!=-1){
					dp[i][j]=dp[i][j-1]%mod;
				}
			}
		}
	}
	return dp[n-1][m-1];
}
public static void main(String[] args) throws IOException{
		// BufferedReader br = new BufferedReader(new
  //      FileReader("sampleinp.txt"));
    	BufferedReader br = new BufferedReader( 
                             new InputStreamReader(System.in)); 
	 	StringBuilder ans=new StringBuilder();
	 	String str[]=br.readLine().split(" ");
	 	n=Integer.parseInt(str[0]);
	 	m=Integer.parseInt(str[1]);
	 	path=new char[n][m];
	 	for(int i=0;i<n;i++){
	 		String x=br.readLine();
	 		for(int j=0;j<m;j++){
	 			path[i][j]=x.charAt(j);
	 		}

	 	}	
	 	ans.append(solve()); 	
		// PrintWriter pw=new PrintWriter(new BufferedWriter(new FileWriter("sampleout.txt")));
  //       pw.write(ans.toString());
  //       pw.flush();
	 	System.out.println(ans.toString());

    }
}