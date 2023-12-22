import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int D = sc.nextInt();
		long G = sc.nextLong();
		
		int[][] map = new int[D][3];
		for (int i = 0; i < D; i++) {
			int[] tmp = new int[3];
			tmp[0] = sc.nextInt();
			tmp[1] = sc.nextInt();
			tmp[2] = i;
			map[i] = tmp;
		}
		
		long Gmax = G;
		int max = 0;
		for (int i = D; i >= 1; i--) {
			int[] tmp = map[i-1];
			long mod = Gmax / (i*100);
			
			if (tmp[0] < mod) {
				mod = tmp[0];
			} else if (Gmax % (i*100) != 0) {
				mod++;
			}
			
			if (tmp[0] == mod) {
				Gmax -= mod*i*100+tmp[1];
			} else {
				Gmax -= mod*i*100;
			}
			
			max += mod;
			
			if (Gmax <= 0)
				break;
		}
		
		
		
		
		System.out.println(max);
	}
}