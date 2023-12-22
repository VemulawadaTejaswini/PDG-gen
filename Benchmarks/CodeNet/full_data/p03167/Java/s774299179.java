

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static int [][]memo ;
    static char [][]a ;
    public static int dp(int i ,int j) {
    	if(i==a.length-1 && j==a[0].length-1)return 1;
    	if (i==a.length || j==a[0].length) return 0;
        if(a[i][j]=='#')return 0;
        if(memo[i][j]!=-1)return memo[i][j];
        int r ; int d;
        if ( memo[i+1][j]!= -1)
        	r = memo[i+1][j];
        else {
         r= memo[i+1][j] = dp(i+1,j);
        }
        if (memo[i][j+1]!= -1)
        	d= memo[i][j+1];
        else {
         d=memo[i][j+1]=dp(i, j+1);
        }
         
     
        return (int) ((r+d)%(Math.pow(10, 9)+7));
    }
    
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		   StringTokenizer st = new StringTokenizer(br.readLine());
			int h = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			a= new char[h][w];
			memo=new int [h+1][w+1];
			
			for (int i = 0; i < h; i++) {
				a[i]= br.readLine().toCharArray();
				Arrays.fill(memo[i], -1);
			}
			Arrays.fill(memo[h], -1);
			
			System.out.println(dp(0, 0));

	}

}
