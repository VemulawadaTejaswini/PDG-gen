import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		int h = stdIn.nextInt();
		int w = stdIn.nextInt();
		
		int cnt = 0;
		
		for(int i = 0; i < n; i++) {
			int a = stdIn.nextInt();
			int b = stdIn.nextInt();
			
			if(a>=h && b >= w) {
				cnt++;
			}
			
		}
		System.out.println(cnt);
		
		
	}

}
