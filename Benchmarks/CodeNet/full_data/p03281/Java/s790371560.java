import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int cnt = 0;
		int cnt1 = 0;
		for(int i = 1; i <=n; i++) {
			if(n % i == 0) {
				cnt++;
			}
		}
		if(cnt == 8) {
			cnt1++;
		}
		
		
		System.out.println(cnt1);
		
		
	}

}
