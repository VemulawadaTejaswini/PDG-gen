
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] sum = new int[n + 1];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			sum[a[i]]++;
		}
		BigInteger ans = new BigInteger("0");
		for(int i = 1; i < n + 1; i++) {
			ans = ans.add(new BigInteger(Integer.toString(sum[i])).multiply(new BigInteger(Integer.toString(sum[i] - 1))).divide(new BigInteger(Integer.toString(2))));
		}
		for(int i = 0; i < n; i++) {
			BigInteger tmp = new BigInteger(ans.toString());
			if(sum[a[i]] >= 2) {
				tmp = tmp.subtract(new BigInteger(Integer.toString(sum[a[i]])).multiply(new BigInteger(Integer.toString(sum[a[i]] - 1))).divide(new BigInteger(Integer.toString(2))));
			}
			if(sum[a[i]] - 1 >= 2) {
				tmp = tmp.add(new BigInteger(Integer.toString(sum[a[i]] - 1)).multiply(new BigInteger(Integer.toString(sum[a[i]] - 2))).divide(new BigInteger(Integer.toString(2))));
			}
			System.out.println(tmp);
		}
	}

}
