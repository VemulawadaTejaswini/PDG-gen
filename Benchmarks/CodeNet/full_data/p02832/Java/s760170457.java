import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int [] array = new int[n];
		for(int i = 0; i < n; i++) {
			array[i] = stdIn.nextInt();
		}
		
		for(int i = 0; i < n; i++) {
			if(array[i] == 1) {
				break;
			}
			if(i == n-1) {
				System.out.println(-1);
				System.exit(0);
			}
		}
		
		int cnt = 1;
		int ans = 0;
		for(int i = 0; i < n; i++) {
			if(array[i] != cnt) {
				ans++;
			}else {
				cnt++;
			}
			
		}
		
		System.out.println(ans);
		
		
	}

}
