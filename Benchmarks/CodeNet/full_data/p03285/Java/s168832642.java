import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int a = 0; a <= n; a+=4) {
			for(int b = 0; b <= n; b+=7) {
				if(a+b == n) {
					System.out.println("Yes");
					return;
				}
			}
		}
		System.out.println("No");
	}
}
