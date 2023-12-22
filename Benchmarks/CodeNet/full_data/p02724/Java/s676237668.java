import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		sc.close();
		int ans = (int)(X/500)*1000;
		ans += ((X%500)-(X%5));
		System.out.println(ans);
	}
}
