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
        int n = (N%min == 0)? 5: 4;
	    long ans = (long)(Math.ceil((double)N/min)+n);
	    System.out.println(ans);
	}
}