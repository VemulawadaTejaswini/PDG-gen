import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long h = sc.nextLong();
		long w = sc.nextLong();
		if(h==1||w==1) {
			System.out.println(1);
			return;
		}
		long k = (h+1)/2;
		long ans ;
		if(h%2==1&&w%2==1) {
			ans = (w+1)/2 * k;
			ans += w/2 *(k-1);
		}
		else {
			ans = w*k;
		}
		System.out.println(ans);
	}
}