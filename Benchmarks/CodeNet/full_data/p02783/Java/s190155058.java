import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int A = sc.nextInt();
		int ans = 0;
		
		if (0 != H%A) {
			ans = H/A + 1;
		} else {
			ans = H/A;
		}
		System.out.println(ans);
	}
}