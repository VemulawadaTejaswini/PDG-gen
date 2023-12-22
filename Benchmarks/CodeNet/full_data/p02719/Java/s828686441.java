import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner v = new Scanner(System.in);
		int n = v.nextInt();
		int k = v.nextInt();
		if (n<k) {
			System.out.println(n);
		}else {
			System.out.println(calc(n,k));
		}
	}
	public static int calc(int n, int k) {
		while(n>0) {
			n = n - k;
		}
		n = -n;
		return n;
	}
}
