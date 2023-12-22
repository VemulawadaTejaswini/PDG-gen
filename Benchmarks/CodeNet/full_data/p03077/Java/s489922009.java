import java.util.*;
public class Main {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    long N = sc.nextLong();
        long min = sc.nextLong();
        for (int i=0; i<4; i++) {
            long num = sc.nextLong();
        	min = (min > num)? num: min;
        }
	    long ans = (long)(Math.ceil(N/min)+5);
	    System.out.println(ans);
	}
}