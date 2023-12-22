import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner in=new Scanner (System.in);
        
		long a=in.nextLong();
		long b=in.nextLong();
		long x=in.nextLong();
		long c=0;
		
		long z=0;
		long y=0;
		for (long i = a; i <= b; i++) {
			if(i%x==0) {
				z=i;
				break;
			}
		}
		for (long i = b; i >= a; i--) {
			if(i%x==0) {
				y=i;
				break;
			}
		}
		c=((y-z)/x)+1;
		System.out.println(c);
	}
}
