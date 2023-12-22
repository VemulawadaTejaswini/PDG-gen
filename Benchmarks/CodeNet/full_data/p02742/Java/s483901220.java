import java.util.*;

public class Main {
	public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    long a = sc.nextInt();
    long b = sc.nextLong();
    long max = Math.max(a,b);
	long min = Math.min(a,b);
	long ans = max/2 * min;
    if (max % 2 == 1 && min % 2 == 1) ans++;
    System.out.println(ans);

    }


}