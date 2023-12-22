import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line1 = br.readLine();
		String[] str1 = line1.trim().split("\\s+");
		int h = Integer.parseInt(str1[0]);
		int w = Integer.parseInt(str1[1]);
		String[][] arr = new String[h][w];
		int[][] dp = new int[h][w];
		for(int i=0;i<h;i++) {
			String line = br.readLine();
			char[] str = line.toCharArray();
			//System.out.println(str.length);
			for(int j=0;j<w;j++) {
				arr[i][j]=Character.toString(str[j]);
				dp[i][j]=-1;
			}
		}	
		System.out.println(function(h-1,w-1,arr,dp));
	}
	public static int function(int x, int y, String[][] arr, int[][] dp) {
		if(x==0 && y==0 && arr[x][y].equals(".")) {
			return 0;
		}
		if(x==0 && y==0 && arr[x][y].equals("#")) {
			return 1;
		}
		if(x<0 || y<0) {
			return Integer.MAX_VALUE;
		}
		if(dp[x][y]!=-1) {
			return dp[x][y];
		}
		if(arr[x][y].equals(".")) {
			dp[x][y]=Math.min(function(x-1,y,arr,dp), function(x,y-1,arr,dp));
		}
		else {
			dp[x][y]=1+Math.min(function(x-1,y,arr,dp), function(x,y-1,arr,dp));;
		}
		return dp[x][y];
	}
}
