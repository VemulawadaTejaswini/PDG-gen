import java.util.Arrays;
import java.util.Scanner;

/**
 * ABC111C
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();
        long D = sc.nextLong();
        
        long CD = lcm(Math.max(C, D),Math.min(C, D));
        
        long cnum = num(C,A,B);
        long dnum = num(D,A,B);;
        long cdnum = num(CD,A,B);
       
        long ans = (B-A+1)-(cnum+dnum-cdnum);
        
//        System.out.println(cnum +" "+ dnum + " " + cdnum);
        

        System.out.println(ans);
        
        sc.close();
    }
    
    static long lcm (long a, long b) {
    	long temp;
    	long c = a;
    	c *= b;
    	while((temp = a%b)!=0) {
    		a = b;
    		b = temp;
    	}
    	return (long)(c/b);
    }
    
    static long num(long n,long A,long B) {
    	if(A%n==0) {
        	return (B-(A))/n+1;
        }else if((A+(n-A%n)>B)){
        	return 0;
        }else {
        	return(B-(A+(n-A%n)))/n+1;
        }
    }
}