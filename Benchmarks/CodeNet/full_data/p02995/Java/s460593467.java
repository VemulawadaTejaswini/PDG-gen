import java.util.*;

class Main{
  
  	public static long gcd(long a,long b){
    	if(b==0)
          return a;
      	else
          return gcd(b,a%b);
    }
	public static void main(String args[]){
    	Scanner sc=new Scanner(System.in);
      long a=sc.nextLong();
      long b=sc.nextLong();
      long c=sc.nextLong();
      long d=sc.nextLong();
      
      long e=c*d/gcd(c,d);
      long sa=(b/c)-((a-1)/c);
      long sb=(b/d)-((a-1)/d);
      long sab=(b/e)-((a-1)/e);
      long diff=b-a+1-sa-sb+sab;
      System.out.print(diff);
      
    }
}