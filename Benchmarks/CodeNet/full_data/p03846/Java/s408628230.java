import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long sum = 0;
                long ans = 1;
		for(int i = 0; i < n; i++) {
			sum += sc.nextInt();
		}
                //System.out.println(sum);
		long key = 0;
		for(int i = n - 1; i >= 1; i -= 2) {
			key += i;
		}
		key *= 2;
                //System.out.println(key);
		if(sum == key) {
			for(int i = 0; i < n / 2; i++) {
                              ans = ans *  2 % 1000000007;
                              //System.out.println(ans); 
                        }
		}
		else ans = 0;
		System.out.println(ans);
	}
}
