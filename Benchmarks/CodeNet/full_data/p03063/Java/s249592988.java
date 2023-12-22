import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
	
	void run() {
		int n = sc.nextInt();
		char[] ch = sc.next().toCharArray();
		
		int[] l = new int[n+1];
		for(int i = 0; i < n;i++) {
			l[i+1] = l[i] + (ch[i]=='#'?1:0);
		}
		
		int min = n;
		
		for(int i = 0; i <= n ; i++) {
			int blackToWhite = l[i];
			int whiteToBlack = (n - l[n]) - (i - l[i]);
			min = Math.min(min, blackToWhite + whiteToBlack);
		}
		
		System.out.println(min);
	}
}
