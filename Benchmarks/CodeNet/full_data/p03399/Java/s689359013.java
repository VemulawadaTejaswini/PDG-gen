import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		sc.close();
		
		int ans = 0;
		if(A > B)
			ans += B;
		else
			ans += A;
		if(C > D)
			ans += D;
		else
			ans += C;
		System.out.println(ans);
	}
}
