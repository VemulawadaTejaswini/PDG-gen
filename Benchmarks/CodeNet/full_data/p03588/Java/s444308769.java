import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a, b;
		int max = 0, ans = 0;
		for(int i = 0; i < n; i++){
			a = sc.nextInt();
			b = sc.nextInt();
			if(max < a) {
				max = a;
				ans = a + b;
			}
		}
		System.out.println(ans);
	}
}