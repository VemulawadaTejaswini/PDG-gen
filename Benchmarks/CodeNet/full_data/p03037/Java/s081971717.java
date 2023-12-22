import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		int m = stdIn.nextInt();
		
		int[] l = new int[m];
		int[] r = new int[m];
		int min = Integer.MAX_VALUE;
		int index = 0;
		for(int i = 0; i < m; i++) {
			l[i] = stdIn.nextInt();
			r[i] = stdIn.nextInt();

			if(min > r[i] - l[i]) {
				min = r[i] - l[i] ;
				index = i;
			}
			
		}
		
		int[] ans = new int[min+1];
		
		boolean[] flag = new boolean[min+1];
		Arrays.fill(flag, true);
		
		int j = 0;
		for(int i = l[index]; i <= r[index]; i++) {
			ans[j++] = i;
		}
		
		for(int i = 0; i < m; i++) {
			for(int k = 0; k < ans.length; k++) {
				if(!(l[i] <= ans[k] && ans[k] <= r[i])) {
					flag[k] = false;
				}
				
			}
			
		}
		long cnt = 0;
		for(int i = 0; i < flag.length; i++) {
			if(flag[i]) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}
