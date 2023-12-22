import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong(), K = sc.nextLong();
		int ans = (int)Math.ceil(Math.log(N)/Math.log(K))*1;
		System.out.println(ans);
	}
}