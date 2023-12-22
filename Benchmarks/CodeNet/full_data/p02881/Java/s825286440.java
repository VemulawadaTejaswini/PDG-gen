import java.util.*;

public class Main { 
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      long n=sc.nextLong();
      long o;
      long x=Long.MAX_VALUE/2;
      long y=Long.MAX_VALUE/2;
      long r=(long)Math.sqrt(n);
      for(long i=1;i<=r;i++){ 
      	if(n%i==0){
        	long j=n/i;
            if ((i+j)<(x+y)){
            	x=i;
                y=j;
            }
        }
      }
      o=x+y-2;
      System.out.println(o);
    }
}