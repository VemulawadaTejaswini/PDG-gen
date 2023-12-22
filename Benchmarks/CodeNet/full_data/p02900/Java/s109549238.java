import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc=new Scanner(System.in);
        long a=sc.nextLong();
      	long b=sc.nextLong();
    	long c=gcd(a,b);
      long d=1;
      
      for(long i=2; i*i<=c;i++){
        if(c%i!=0) continue;
      	while(c%i==0){
        	c/=i;
        }
        d++;
      }
      if(c>1) d++;
      System.out.println(d);
        
    }
  	
  	private static long gcd(long a, long b){
    	while(b%a!=0){
        	long c=b%a;
          	b=a;
          	a=c;
        }
      return a;
    }
  
}