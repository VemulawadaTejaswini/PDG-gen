import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int[] p = new int[n];
		
		for(int i = 0; i < n; i++) {
			p[i] = stdIn.nextInt();
		}
		boolean [] flag = new boolean[n];
		for(int i = 0; i < n; i++) {
			flag[i] = true;
		}
		
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < i; j++) {
				if(p[i] > p[j]) {
					flag[i] = false;
				}
			}
		}
		int cnt = 0;
		for(int i = 0; i < n; i++) {
			if(flag[i]) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}
