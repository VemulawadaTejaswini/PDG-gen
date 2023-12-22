import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] s_in;
		
		int N = Integer.parseInt(line);
		
		line = sc.nextLine();
		s_in = line.split(" ");
		int T = Integer.parseInt(s_in[0]);
		int A = Integer.parseInt(s_in[1]);
		
		int[] h = new int[N];
		line = sc.nextLine();
		s_in = line.split(" ");
		for(int i=0;i<N;i++) {
			h[i] = Integer.parseInt(s_in[i]);
		}
		
		double[] tempe = new double[N];
		for(int i=0;i<N;i++) {
			tempe[i] = (double)T - h[i]*0.006;
		}
		
		int nearest_h = -1;
		double nearest_dist = 100000;
		for(int i=0;i<N;i++) {
			if(Math.abs(nearest_dist - A) > Math.abs(tempe[i] - A)) {
				nearest_dist = tempe[i];
				nearest_h    = i;
			}
		}
		System.out.println(nearest_h+1);
	}
}
