import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		double x[]=new double[n];
		double y[]=new double[n];

		for(int i=0;i<n;i++){
			x[i]=sc.nextDouble();
			y[i]=sc.nextDouble();
		}
		double ans=0;
for(int i=0;i<n-1;i++){
	for(int o=i+1;o<n;o++){
		ans+=dist(x[i],y[i],x[o],y[o])/n;

	}
}
System.out.println(2*ans);

	}

static public double dist(double a,double b,double c,double d){
double ans=(a-c)*(a-c)+(b-d)*(b-d);
ans=Math.sqrt(ans);
return ans;
}
}