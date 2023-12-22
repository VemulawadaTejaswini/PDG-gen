
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());
		
		int [][]land = new int [m][2];
		
		for(int i = 0 ;i < m ;i++) {
			land[i][0] = Integer.parseInt(sc.next());
			land[i][1] = Integer.parseInt(sc.next());
		}
		Arrays.sort(land,(x,y) -> x[1] - y[1]);
		
		int now = -1;
		int ans = 0;
		
		for(int i = 0 ; i < m ;i++) {
			if(now <= land[i][0]) {
				now = land[i][1];
				ans++;
			}
		}
		
		System.out.println(ans);
		

	}
}