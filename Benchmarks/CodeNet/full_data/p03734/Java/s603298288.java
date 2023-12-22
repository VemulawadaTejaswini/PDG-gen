import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	void run() {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int w = sc.nextInt();
			int[][] v = new int[n][2];
			for(int i=0;i<n;i++) {
				v[i][0] = sc.nextInt();
				v[i][1] = sc.nextInt();
			}
			
			Arrays.sort(v, new Comparator<int[]>(){
				public int compare(int[] o1, int[] o2) {
					double x1 = (double)o1[1]/o1[0];
					double x2 = (double)o2[1]/o2[0];
					
					if (x1 < x2) {
						return 1;
					}
					return -1;
				}
			});
			
			long max = 0;
			for(int i=0;i<n;i++) {
				long sumV = 0;
				long sumW = 0;
				for(int j=i;j<n;j++) {
					if(sumW + v[j][0] <= w) {
						sumW += v[j][0];
						sumV += v[j][1];
					}
				}
				max = Math.max(max, sumV);
			}
			
			System.out.println(max);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
	
}
