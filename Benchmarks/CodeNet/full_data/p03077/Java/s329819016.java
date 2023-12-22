import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);       
        long n = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();
        long e = sc.nextLong();
        long f = Math.max(a,Math.max(b,Math.max(c,Math.max(d,e))))
		System.out.println(5+n/f);
  }
}
