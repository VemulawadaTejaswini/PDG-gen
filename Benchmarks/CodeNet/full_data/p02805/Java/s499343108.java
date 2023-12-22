import java.util.*;
import java.math.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		double[] x=new double[n];
		double[] y=new double[n];
		for(int i=0; i<n; i++){
			x[i]=sc.nextDouble();
			y[i]=sc.nextDouble();
		}
		double max=0;
		for(int i=0; i<n; i++){
			for(int j=i; j<n; j++){
				double m=Math.sqrt((Math.abs(x[i]-x[j])*Math.abs(x[i]-x[j])+Math.abs(y[i]-y[j])*Math.abs(y[i]-y[j]))/4.0);
				max=Math.max(max,m);
			}
		}
		System.out.println(max);
	}
}
