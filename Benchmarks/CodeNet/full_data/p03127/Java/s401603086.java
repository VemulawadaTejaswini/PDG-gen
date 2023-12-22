import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());

		int ans = Integer.parseInt(sc.next());

		for (int i=0; i<n-1; i++){
			ans = gcd(ans, Integer.parseInt(sc.next()));
		}
		System.out.println(ans);
	}

	public static int gcd(int num1, int num2) {
		if (num2 == 0){
			return num1;
		}else {
			return gcd(num2, num1%num2);
		}
	}
}