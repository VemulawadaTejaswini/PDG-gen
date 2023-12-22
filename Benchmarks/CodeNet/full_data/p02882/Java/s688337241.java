import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt(),b=sc.nextInt(),x=sc.nextInt();
		double ans;
		if(x>=(double)a*a*b/2) ans = (double)2*(a*a*b-x)/(a*a*a);
		else ans = (double)a*b*b/(2*x);
		System.out.printf("%.10f\n",(double)180*Math.atan(ans)/Math.PI);
	}
}