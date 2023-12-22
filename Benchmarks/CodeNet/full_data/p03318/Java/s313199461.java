import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String ans = "";
		Scanner sc = new Scanner(System.in);
		long k = sc.nextLong();
		for(int i = 1; i < 10; i++) {
			ans += Integer.toString(i) + "\n";
			k--;
			if(k == 0)break;
		}
		for(int i = 19; k > 0; i += 10) {
			ans += Integer.toString(i) + "\n";
			k--;
		}
		System.out.println(ans);
		
	}
}