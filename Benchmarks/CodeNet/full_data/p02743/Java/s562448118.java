import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		long a = scn.nextLong();
		long b = scn.nextLong();
      	long c = scn.nextLong();
      	long x = 2*(a*b + b*c + c*a);
      	long y = a*a + b*b + c*c;
      	long z = c - a - b;
      	String ans = "No";
      	if(z>0 && x<y) ans = "Yes";
      	System.out.println(ans);
	}
}
