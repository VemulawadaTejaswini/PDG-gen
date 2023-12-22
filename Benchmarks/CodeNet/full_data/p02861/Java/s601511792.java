import java.util.*;
import static java.lang.System.*;
import java.math.*;

public class Main {
	static double cnt = 0;
	static int count = 0;
	static double[][] dist;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] pos = new int[n][2];
		for (int i = 0; i < n; i++) {
			pos[i][0] = sc.nextInt();
			pos[i][1] = sc.nextInt();
		}
		dist = new double[n][n];
		for (int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				int x1 = pos[i][0],  x2 = pos[j][0] , y1 = pos[i][1] ,y2 = pos[j][1];
				int X = (x1-x2) * (x1-x2), Y = (y1-y2) * (y1-y2);
				double d = Math.sqrt( X+Y );
				dist[i][j] = d;
			}
		}
		
		int[] list = new int[n];
		for(int i = 0; i < n; i++)
			list[i] = i + 1;	
		permutation(list);
		double ans = cnt / count;
		out.print(ans);
		
	}
    static void permutation(int[] seed) {
        int[] perm = new int[seed.length];
        boolean[] used = new boolean[seed.length];
        buildPerm(seed, perm, used, 0);
    }

     static void buildPerm(int[] seed, int[] perm, boolean[] used, int index) {
        if (index == seed.length) {
            procPerm(perm);
            return;
        }

        for (int i = 0; i < seed.length; ++i) {
            if (used[i]) continue;
            perm[index] = seed[i];
            used[i] = true;
            buildPerm(seed, perm, used, index + 1);
            used[i] = false;
        }
    }

    static void procPerm(int[] perm) {
    	count++;
        for (int i = 0; i < perm.length - 1; i++) {
        	int a = perm[i], b = perm[i + 1];
        	cnt += dist[a - 1][b - 1];
        	//out.println(a + " → " + b + ": " + dist[a-1][b-1]);
        }
    }
}