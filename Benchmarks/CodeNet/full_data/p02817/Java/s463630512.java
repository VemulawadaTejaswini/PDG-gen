import java.util.*;
public class Main{
	public static void main(String [] args){
    	Scanner scan = new Scanner(System.in);
      	long a = scan.nextLong();
      	long b = scan.nextLong();
      	long k = scan.nextLong();
      	if(a>=k){
        a=a-k;
        }
      else{
      b=b-(k-a);
        a=0;
        if(b<0){
          b=0;
        }
        
      }
      System.out.println(a+" "+b);
    }
}
