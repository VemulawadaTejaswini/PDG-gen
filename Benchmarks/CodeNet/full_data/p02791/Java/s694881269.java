import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int[] p = new int[n];
		
		for(int i = 0; i < n; i++) {
			p[i] = stdIn.nextInt();
		}
		
	
		int cnt = 1;
		
		for(int i = 1; i < n; i++) {
			Arrays.sort(p,0,i);
			if(p[i]<=p[0]) {
				cnt++;
			}
		}

		System.out.println(cnt);
	}

}
