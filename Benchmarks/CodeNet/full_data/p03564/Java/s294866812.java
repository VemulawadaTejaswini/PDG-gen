import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt(); //n回
		int k = stdIn.nextInt();//足す
		
		int ans = 1;
		
		for(int i = 0; i < n; i++) {
			ans = Math.min(ans*2, ans+k);
		}
		System.out.println(ans);
		
		
	}

}
