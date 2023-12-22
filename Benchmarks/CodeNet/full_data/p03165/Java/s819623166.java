
                    import java.io.BufferedReader;
                    import java.io.FileReader;
                    import java.io.IOException;
                    import java.io.InputStream;
                    import java.io.InputStreamReader;
                    import java.io.PrintWriter;
                    import java.math.BigInteger;
                    import java.util.*;
                        public class Main {

                    
                    	    static PrintWriter pw = new PrintWriter(System.out);
                    	    static int[][] dp;
                    	    public static int f(String a,String b,int i,int j) {
                    	    	if(i==a.length())return 0;
                    	    	if(j==b.length())return 0;
                    	    	if(dp[i][j]!=-1)return dp[i][j];
                    	    	if(a.charAt(i)==b.charAt(j))
                    	    		return dp[i][j]=1+f(a,b,i+1,j+1);
                    	    	return dp[i][j] = Math.max(f(a,b,i+1,j),f(a,b,i,j+1));
                    	    }
                    	    public static void f2(String a,String b,int i,int j) {
                    	    	if(i==a.length())return ;
                    	    	if(j==b.length())return ;
                    	    	if(a.charAt(i)==b.charAt(j)) {
                    	    		pw.print(a.charAt(i));
                    	    		f2(a,b,i+1,j+1);
                    	    		return;
                    	    	}
                    	    	if(dp[i][j+1]>=dp[i+1][j]) {
                    	    		f2(a,b,i,j+1);
                    	    		return;
                    	    	}else {
                    	    		f2(a,b,i+1,j);
                    	    		return;
                    	    	}
                    	    }
                    	   // static long[][] C = binomialCoeff(1000, 5);
                    	    
                    	public static void main(String[] args) throws IOException{
                    		Scanner sc = new Scanner(System.in);
                    		String a = sc.next();
                    		String b = sc.next();
                    		dp = new int[3000][3000];
                    		for(int i=0;i<dp.length;i++)
                    			for(int j=0;j<dp[i].length;j++)
                    				dp[i][j] = -1;
                    		f(a,b,0,0);
                    		f2(a,b,0,0);
                    		pw.flush();
                    		pw.close();
                    	}
                    }