import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String in[] = new String[2];
		int n = 0, d = 0;
		try {
			line = br.readLine();
			in = line.split(" ");
			n = Integer.parseInt(in[0]);
			d = Integer.parseInt(in[1]);
		} catch (IOException e) {
			e.getStackTrace();
		}
		
		String in_d [] = new String[d];
		int in_dnum [][] = new int [d][n];
		try {
			for (int i = 0; i < n; i++) {
				line = br.readLine();
				in_d = line.split(" ");
				for (int j = 0; j < d; j++) {
					in_dnum[j][i] = Integer.parseInt(in_d[j]);
				}
			}
		} catch (IOException e) {
			e.getStackTrace();
		}
		
		int c = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i+1; j < n; j++) {
				double dis;
				dis = dis(i, j, in_dnum);
				if(Math.ceil(dis) == dis) {
					c++;
				}
			}
		}
		System.out.println(c);
	}
	
	static double dis(int s1, int s2, int[][] in) {
		int dis = 0;
		for (int i = 0; i < in.length; i++) {
			dis += Math.pow(Math.abs(in[i][s1] - in[i][s2]),2);
		}
		return Math.sqrt(dis);
	}
}