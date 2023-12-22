import java.util.*;

public class Main {
	public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    long a = sc.nextInt();
    long b = sc.nextLong();
    long max = Math.max(a,b);
	long min = Math.min(a,b);
	double ans = max/2.0 * min;
    System.out.println(Math.round(ans+0.5));

    }


}