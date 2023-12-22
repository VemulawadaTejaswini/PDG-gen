import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      long n = sc.nextLong();
      long a = sc.nextLong();
      long b = sc.nextLong();
      long c = sc.nextLong();
      long d = sc.nextLong();
      long e = sc.nextLong();
      long x = Math.min(a,b);
      long y = Math.min(c,d);
      long min = Math.min(x,Math.min(y,e));
      long s = 0;
      if(n%min==0)s = n/min;
      else s = n/min+1;
      System.out.println(4+s);
    }
}