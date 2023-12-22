import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long ans = doubleFunctional(n);
		String ansNum = String.valueOf(ans);
		int Count = 0, i = ansNum.length();
		int x = ansNum.charAt(i-1);
		while(x == 0) {
			x = ansNum.charAt(i-2);
			Count++;
			i--;
		}
		System.out.println(Count);
	}
	
	public static long doubleFunctional(long n) {
		if(n < 2L) {
			return 1;
		}else {
			long x = n*doubleFunctional(n-2);
			return x;
		}
	}
}