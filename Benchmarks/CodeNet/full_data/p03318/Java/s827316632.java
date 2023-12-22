import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String ans = "";
		Scanner sc = new Scanner(System.in);
		long k = sc.nextLong();
		long mag = 1;
		long sunuke = 1;
		for(long i = 1; k > 0; i += mag) {
			ans += Long.toString(i) + "\n";
			k--;
			if((int)Math.log10(i) != (int)Math.log10(i + mag))mag *= 10;
		}
		System.out.println(ans);
	}
}