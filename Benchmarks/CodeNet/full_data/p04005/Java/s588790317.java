import java.util.Scanner;

public class Main {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		long a = in.nextLong(), b = in.nextLong(), c = in.nextLong();
		if(a % 2 ==0 || b % 2 ==0 || c % 2 ==0 ){
			System.out.println("0");
		}else{
			long ans = a * b;
			ans = Math.min(ans, a * c);
			ans = Math.min(ans, b * c);
			System.out.println(ans);
		}
	}
}
