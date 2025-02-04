import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution {

	public Solution() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int N = sc.nextInt();
		BigInteger[] a = new BigInteger[3*N];
		for(int i = 0; i < 3*N; i++)
			a[i] = BigInteger.valueOf(sc.nextLong());
		sc.close();
		List<BigInteger> aList = Arrays.asList(a);
		Collections.sort(aList);
		System.out.println(aList);
		BigInteger sum = BigInteger.ZERO;
		for(int i = aList.size() - 2; i >= N; i -= 2) {
			sum = sum.add(aList.get(i));
			System.out.println(aList.get(i));
			System.out.println(sum);
		}
		
		System.out.println(sum);
	}

}
