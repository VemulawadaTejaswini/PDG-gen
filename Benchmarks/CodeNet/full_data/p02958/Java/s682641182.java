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
		for(int i = 0; i < n-1; i++) {
			if(p[i] > p[i+1]){
				cnt++;
			}
		}
		
		if(cnt>= 2) {
			System.out.println("NO");
		}else {
			System.out.println("YES");
		}
	}

}
