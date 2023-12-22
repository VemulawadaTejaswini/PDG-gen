
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	Map<Long, ArrayList<Long>> m = new HashMap<Long ,ArrayList<Long>>();

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int W = sc.nextInt();


		int w0=0;
		ArrayList<ArrayList<Integer>> wv = new ArrayList<ArrayList<Integer>>();
		for(int i=0; i<4; i++) {
			wv.add(new ArrayList<Integer>());
		}
		for(int i=0; i<n; i++) {
			int w=sc.nextInt();
			int v=sc.nextInt();
			if(i==0) w0=w;
			wv.get(w-w0).add(v);
		}
		for(int i=0; i<4; i++) {
			Collections.sort(wv.get(i), (x,y)->Integer.compare(y, x));
		}
		long s[][] = new long[4][n+1];
		for(int i=0; i<4; i++) {
			s[i][0]=0;
		}
		for(int i=0; i<4; i++) {
			for(int j=0; j<wv.get(i).size(); j++) {
				s[i][j+1] = s[i][j] + wv.get(i).get(j);
			}
		}

		long max = -1;
		for(int i=0; i<=wv.get(0).size(); i++) {
			for(int j=0; j<=wv.get(1).size(); j++) {
				for(int k=0; k<=wv.get(2).size(); k++) {
					for(int l=0; l<=wv.get(3).size(); l++) {
						if((w0*i + (w0+1)*j + (w0+2)*k + (w0+3)*l)>W) continue;
						max = Math.max(max, s[0][i] + s[1][j] + s[2][k] + s[3][l]);
					}
				}
			}
		}
		System.out.println(max);
		sc.close();
	}


}


