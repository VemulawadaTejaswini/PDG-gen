import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b =sc.nextInt();
		int c = sc.nextInt();
		int ans = 0;
		if(a == b) {
			if(b == c) ans = 1;
			else ans = 2;
		}else if(b == c) {
			ans = 2;
		}else if(a == c){
			ans = 2;
		}else {
			ans = 3;
		}
		System.out.println(ans);
		sc.close();
	}
}