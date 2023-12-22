import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int H = sc.nextInt();
		int W = sc.nextInt();
		int h = H-1;
		int w = W-1;
		if(H == n) {
			h = H-1;
		}
		if(W == n) {
			w = W-1;
		}
		int ans = (n-h)*(n-w);
		System.out.println(ans);
		sc.close();
	}
}
