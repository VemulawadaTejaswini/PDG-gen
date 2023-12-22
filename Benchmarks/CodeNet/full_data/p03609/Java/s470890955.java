import java.util.Scanner;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt(), ans = 0;
		if(a - b > 0) {
			ans = a - b;
		}else {
			ans = 0;
		}
		System.out.println(ans);
		
	}
}