import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args){
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] p = new int[m];
		int[] year = new int[m];
		StringBuilder[] y = new StringBuilder[m];
		
		for(int i = 0; i < m; ++i) {
			p[i] = sc.nextInt() - 1;
			year[i] = sc.nextInt();
			if(y[p[i]] == null) {
				y[p[i]] = new StringBuilder(String.valueOf(year[i]));
			}else{
				y[p[i]].append(':');
				y[p[i]].append(year[i]);
			}
		}
		
		String[][] ystr = new String[m][];
		for(int i = 0; i < m; ++i) {
			if(y[i] != null) {
				ystr[i] = y[i].toString().split(":");
				Arrays.sort(ystr[i]);
				y[i] = null;
			}
		}
		
		for(int i = 0; i < m; ++i) {
			String key = String.valueOf(year[i]);
			int index = Arrays.binarySearch(ystr[p[i]], key) + 1;
			System.out.printf("%06d%06d\n", p[i] + 1, index);
		}
	}
}