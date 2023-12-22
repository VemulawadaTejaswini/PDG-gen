import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int n = N;
		int sum = 0;
		for(int i = 7;i >= 0;i--) {
			sum = sum + n/(int)Math.pow(10, i);
			n = n - (sum * (int)Math.pow(10, i));
		}
		if(N % sum == 0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		sc.close();
	}
}