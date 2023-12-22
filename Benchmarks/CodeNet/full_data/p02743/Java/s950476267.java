import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double aq = Math.sqrt(a);
		double bq = Math.sqrt(b);
		double cq = Math.sqrt(c);
		String ans = "No";
		if(aq + bq < cq){
			ans = "Yes";
		}
		System.out.println(ans);
	}
}