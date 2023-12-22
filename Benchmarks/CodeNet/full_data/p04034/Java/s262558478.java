import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		boolean[] red = new boolean[n];
		int[] white = new int[n];
		red[0] = true;
		for(int i = 1; i < n; i++) {
			white[i] = 1;
		}
		
		for(int i = 0; i < m; i++) {
			int x = sc.nextInt()-1;
			int y = sc.nextInt()-1;
			if(red[x]) {
				if(white[x] == 0) {
					red[x] = false;
					red[y] = true;
				} else {/////
					red[y] = true;
					white[x]--;
				}
			} else {
				white[x]--;
				white[y]++;
			}
		}
		
		sc.close();
		
		int ans = 0;
		for(int i = 0; i < n; i++) {
			if(red[i]) ans++;
		}
		System.out.println(ans);
	}
	
}