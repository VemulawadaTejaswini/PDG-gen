import java.util.*;
import java.util.ArrayDeque;
import java.util.Queue;
import java.math.RoundingMode;
import java.math.BigDecimal;


public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long sum = 0;
		for(long i = 1; i <= n; i++) {
			if(i%3!=0&&i%5!=0) {
				sum+=i;
			}
		}
		System.out.println(sum);
	}
}