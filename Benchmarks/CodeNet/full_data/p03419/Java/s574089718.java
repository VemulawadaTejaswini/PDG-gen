import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args)  {
		Scanner sc = new Scanner((System.in));
		int n = sc.nextInt() ;
		int m = sc.nextInt();
		sc.close();
		int count = 0;
		if((n==1) || (m==1)) {
			if(n > m) {
				count = n - 2;
			}else if(m > n) {
				count = m -2;
			}else {
				count = 1;
			}
		}else if((n==2) || (m==2)) {
			count = 0;
		}else {
			count = (n-2)*(m-2);
		}
		System.out.println(count);
	}
}