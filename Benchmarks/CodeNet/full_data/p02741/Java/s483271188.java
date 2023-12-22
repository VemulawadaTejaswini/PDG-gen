import java.util.*;
public class Main{
	public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    	long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long asq =(long) Math.sqrt(a);
        long bsq = (long)Math.sqrt(b);
        long csq = (long)Math.sqrt(c);
        if(asq+bsq < csq)
        	System.out.println("Yes");
        else
       		System.out.println("No");
    }
}