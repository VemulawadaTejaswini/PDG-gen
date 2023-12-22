import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		
		int ans = a + b;
		if(ans > b + c)
			ans = b + c;
		if(ans > c + a)
			ans = c + a;
		System.out.println(ans);
	}
}
