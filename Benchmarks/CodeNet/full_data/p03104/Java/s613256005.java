import java.util.*;
import java.math.*;
 
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long result =a;
		for(long i=a+1l;i<=b;i++){
			result = result^i;
        	// System.out.println("result"+result);
		}

        System.out.println(result);
	}


}
