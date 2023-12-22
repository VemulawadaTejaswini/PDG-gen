import java.util.*;
import java.util.ArrayDeque;
import java.util.Queue;
import java.math.RoundingMode;
import java.math.BigDecimal;


public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long x=Math.max(a, b);
		long y = Math.min(a, b);
		long tmp;
	    while ((tmp = x % y) != 0) {
	    	x = y;
	        y = tmp;
	    }
		long sum = 1;
		for(long i = 2; i < y; i++) {
			if(y%i==0) {
				for(long j = 2; j < i; j++) {
					long y_div = i;
					if(i%j == 0) {
						sum--;
						break;
					}
				}
			sum++;
			}
		}
		System.out.println(sum);
	}
}