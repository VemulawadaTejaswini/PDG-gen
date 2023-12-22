import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int N = sc.nextInt();
		Long[] a = new Long[3*N];
		for(int i = 0; i < 3*N; i++)
			a[i] = sc.nextLong();
		sc.close();
		List<Long> aList = Arrays.asList(a);
		Collections.sort(aList);
		BigInteger sum = BigInteger.ZERO;
		for(int i = aList.size() - 2; i >= N; i -= 2) {
			sum = sum.add(BigInteger.valueOf(aList.get(i)));
		}	
		System.out.println(sum);
	}

}
