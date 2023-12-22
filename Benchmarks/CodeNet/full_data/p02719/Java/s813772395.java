import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		long n = scan.nextLong();
		long k = scan.nextLong();

		boolean flag = true;
		if ( n > k){
			long w = n / k;
			n = n - (k*w);
		}
		while(flag){
			long min = 0;
			if( n < k){
				min = k - n;
			}else{
				min = n -k;
			}
			if(n <= min){
				flag = false;
			}else{
				n =min;
			}
		}
		System.out.println(n);

	}
}