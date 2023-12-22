import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc=new Scanner(System.in);
        long a=sc.nextLong();
      	long b=sc.nextLong();
    	long c=gcd(a,b);
      int d=0;
      
      for(int i=2; i<=c;i++){
        if(c%i!=0){continue;}
      	while(c%i==0){
        	c=c/i;
        }
        d++;
      }
      
      System.out.println((d+1));
        
    }
  	
  	public static long gcd(long a, long b){
    	while(b%a!=0){
        	long c=b%a;
          	b=a;
          	a=c;
        }
      return a;
    }
  
}