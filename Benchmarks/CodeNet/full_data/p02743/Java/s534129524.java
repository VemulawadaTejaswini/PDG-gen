import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		double a = scn.nextDouble();
		double b = scn.nextDouble();
      	double c = scn.nextDouble();
      	double ab = Math.sqrt(a*b);
      	String ans = "No";
      	if(2*ab < c-a-b) ans = "Yes";
      	System.out.println(ans);
	}
}
