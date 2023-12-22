import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt(),b=sc.nextInt(),x=sc.nextInt();
		double ans = (double)2*(a*a*b-x)/(a*a*a);
		double res = (double)Math.atan(ans)*180/Math.PI;
		System.out.printf("%.10f\n",res);
	}
}