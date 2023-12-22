import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner in=new Scanner (System.in);
        
		long a=in.nextLong();
		long b=in.nextLong();
		long x=in.nextLong();
		long c=0;
		if(x>=a) {
			c=b/x;
		}
		else {
			for (double i = a; i <= b; ) {
				if(i%x==0) {
					c++;
					i=i+x;
				}
				else
					i++;
			}
		}
		
		System.out.println(c);
	}
}