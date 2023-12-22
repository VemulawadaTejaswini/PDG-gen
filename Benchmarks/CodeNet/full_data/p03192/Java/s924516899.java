import java.util.*;
public class twelvetwentytwo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int counter = 0;
		int len = (int)(Math.log10(n));
		while(n!=0) {
			int mod = (int)Math.pow(10, len);
			if((n-(n%mod))/mod == 2) {
				counter++;
			}
			len--;
			n = n%mod;
		}
		System.out.println(counter);
	}
}
