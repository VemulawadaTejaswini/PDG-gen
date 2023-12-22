import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int [] p = new int[n];
		
		for(int i = 0; i < n; i++) {
			p[i] = stdIn.nextInt();
		}
		int cnt = 0;
		
		
		for(int i = 0; i < n; i++) {
			if(p[i]!= i+1) {
				cnt++;
			}
		}
		if(cnt <= 2) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
		
	}

}
