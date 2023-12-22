import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		double[] x=new double[a];
		double[] y=new double[a];
		double aa=1;
		for(int i=0; i<a; i++){
			x[i]=sc.nextDouble();
			y[i]=sc.nextDouble();
			aa*=i+1;
		}
		double k=(aa/a)*2;
		double sum=0;
		for(int i=0; i<a; i++){
			for(int j=i+1; j<a; j++){
				sum+=k*Math.sqrt((x[i]-x[j])*(x[i]-x[j])+(y[i]-y[j])*(y[i]-y[j]));
			}
		}
		System.out.println(sum/aa);
	}
}
