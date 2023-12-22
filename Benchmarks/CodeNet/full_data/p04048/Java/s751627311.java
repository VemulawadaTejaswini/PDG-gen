import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long x = sc.nextLong();
		long r;
		long a = n,b = x;
		while( (r = a % b) != 0 ) {
            a = b;
            b = r;
        }
        if(b != 0){
        	n /= b;
			System.out.println((3*n-3)*b);
		}else{
			System.out.println(3*n-3);
		}
	}
}
