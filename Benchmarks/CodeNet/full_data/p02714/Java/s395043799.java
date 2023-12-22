import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		int n = sca.nextInt();
		String s = sca.next();
		int[] r = new int[4001];
		int r_index = 1;
		int[] g = new int[4001];;
		int g_index = 1;
		int[] b = new int[4001];;
		int b_index = 1;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == 'R') {
				r[r_index] = i+1;
				r_index++;
			}
			else if(s.charAt(i) == 'G') {
				g[g_index] = i+1;
				g_index++;
			}
			else {
				b[b_index] = i+1;
				b_index++;
			}
		}
		int[] h = new int[3];
		long max = (long)((r_index - 1))*(g_index - 1)*(b_index - 1);
		for(int i = 1; i < r_index; i++) {
			for(int j = 1; j < g_index; j++) {
				for(int k = 1; k < b_index; k++) {
					h[0] = r[i];
					h[1] = g[j];
					h[2] = b[k];
					Arrays.sort(h);
					if(2*h[1] == h[0] + h[2]) {
						max--;
					}
				}
			}
		}

		System.out.println(max);

		// 後始末
		sca.close();
	}
}