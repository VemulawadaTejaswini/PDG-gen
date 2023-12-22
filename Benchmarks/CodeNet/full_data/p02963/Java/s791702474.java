import java.util.*;

 class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a=0;
        long b=0;
        long c=0;
        long d=0;
        
        long S = sc.nextLong();
        double aa = Math.sqrt(S);
        a = (long) Math.sqrt(S);
        if(aa!=a) {
        	a = a + 1;
        }
        d = a;
        if(S!=a*d) {
        long w = (a*d) - S;
        if (w<100000000) {
        	b=w;
        	c=1;
        } else {
        	for (int i=100; i>1; i--) {
        		if(w%i==0) {
        			b=w/i;
        			c=i;
        			break;
        		}
        	}
        }
        }
        System.out.println("0 0 " + a + " " + b + " " + c + " " + d);	
        
        
    }
}