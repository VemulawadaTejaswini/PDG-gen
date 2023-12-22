import java.util.*;
import java.io.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		String[] hw = br.readLine().split(" ");
		int h = Integer.parseInt(hw[0]);
		int w = Integer.parseInt(hw[1]);

		int[][] c = new int[10][10];
		for(int i = 0; i < 10; i++) {
			String[] currLine = br.readLine().split(" ");
			for(int j = 0; j < 10; j++) {
				c[i][j] = Integer.parseInt(currLine[j]);
			}
		}

		int[][] a = new int[h][w];
		for(int i = 0; i < h; i++) {
			String[] currLine = br.readLine().split(" ");
			for(int j = 0; j < w; j++) {
				a[i][j] = Integer.parseInt(currLine[j]);
			}
		}

		// int[][] dist = new int[10][10];
		for (int k = 0; k < 10; k++)   {  
	        for (int i = 0; i < 10; i++)  {  
	            for (int j = 0; j < 10; j++) {  
	                if (c[i][k] + c[k][j] < c[i][j])  
	                    c[i][j] = c[i][k] + c[k][j];  
	            }  
	        }  
	    }

	    int ans = 0;

	    for(int i = 0; i < h; i++) {
	    	for(int j = 0; j < w; j++) {
	    		if(a[i][j] != -1 && a[i][j] != 1) {
	    			ans += c[a[i][j]][1];
	    		}
	    	}
	    }

	    System.out.println(ans);
	}
}