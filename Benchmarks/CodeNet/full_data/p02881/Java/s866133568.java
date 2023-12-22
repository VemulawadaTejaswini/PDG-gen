import java.util.*;
import java.util.ArrayDeque;
import java.util.Queue;
import java.math.RoundingMode;
import java.math.BigDecimal;


public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		double lim = Math.sqrt(n);
		long i = 2;
		long sub = n-1;
		long a = n;
		long b = 1;
		while(i <= lim) {
			long memo = n-i;
			if(n%i==0&&sub>memo) {
				a = n/i;
				b = i;
				sub = memo;
			}
			i++;
		}
		System.out.println(a+b-2);
	}	
}