import java.util.*;
public class Main
{

public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
	   long x=in.nextLong();
	   long y=in.nextLong();
      long p=gcd(x,y);
      long  lcm= x*y/p;
      int ok=1;
long ans=-1;
for(long i=x;i<lcm;i+=x)
{
if(i%y==0)
{
ok=0;
break;
}
else {ans=i;break;}
}
      if(ok==0)
      System.out.println(-1);
      else
    	  System.out.println(ans);
	    }
	static long gcd (long a,long b) {
		return b==0?a:gcd(b,a%b);
	}
}