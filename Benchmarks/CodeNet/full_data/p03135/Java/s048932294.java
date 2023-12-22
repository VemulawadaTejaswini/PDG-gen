import java.util.*;


public class Main {
	public static void main (String[] args){
		Scanner sc= new Scanner(System.in);
		double T=sc.nextDouble();
		double X=sc.nextDouble();
		
		double ans=T/X;
		
		System.out.println(String.format("%.10f", ans));
	}

}
