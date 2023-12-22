import java.util.*;
public class Main {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int m=sc.nextInt();
      for(int i=0;i<n-1;i++)
        m=gcd(m,sc.nextInt());
      System.out.println(m);
      
	}
  	public static long gcd(long m, long n) {
		if(m < n) return gcd(n, m);
	    if(n == 0) return m;
	    return gcd(n, m % n);
	}
  public static int gcd(int m, int n) {
		if(m < n) return gcd(n, m);
	    if(n == 0) return m;
	    return gcd(n, m % n);
	}

}
