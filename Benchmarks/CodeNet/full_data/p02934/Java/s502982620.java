import java.util.*;
public class Main {	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int aa = sc.nextInt();
		double x[] = new double[aa];
		for(int n = 0; n < aa; n++){
			x[n] = sc.nextInt();
		}
		double a = 1;
		double b = x[0];
		for(int n=1; n < aa; n++){
			a = a*x[n] + b;
			b *= x[n];
			double t = f(Math.max(a, b), Math.min(a, b));
			a = a / t;
			b = b / t;
		}
		System.out.println((double)b/(double)a);
		
		
	}
	
	public static double f(double d, double e){
		double t = d % e;
		if(t == 1)return 1;
		else if(t == 0)return e;
		else return f(e, t);
	}
}