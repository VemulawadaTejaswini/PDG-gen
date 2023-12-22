import java.io.*;
import java.util.*;
import java.math.*;

class Main {
	public static void main(String args[]) {
    	Scanner sc = new Scanner(System.in);	
	    int t = sc.nextInt();
      	int x = sc.nextInt();
      	BigDecimal res = new BigDecimal((double)t/x);
      	System.out.println(res.setScale(10,BigDecimal.ROUND_HALF_DOWN));
    }
}
