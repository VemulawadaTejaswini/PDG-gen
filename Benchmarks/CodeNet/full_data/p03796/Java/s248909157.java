import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long p = 1;
		for(int i = 1; i <= n; i++) {
			p = (p * i)%1000000007;
		}
		System.out.println(p);
	}
}