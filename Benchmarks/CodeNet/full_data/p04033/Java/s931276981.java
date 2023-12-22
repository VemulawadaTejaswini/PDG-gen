import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		String res;
		if(a > 0) {
			res = "Positive";
		}else if(a <= 0 && b >= 0) {
			res = "Zero";

		}else {
			int cnt = -a - (-b)+1;
			if(cnt%2==0) {
				res = "Positive";
			}else {
				res = "Negative";
			}
		}
		System.out.println(res);
	}
}