import java.util.Scanner;
public class Main {
@SuppressWarnings("resource")
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	int N=sc.nextInt();
	double x[]=new double[N];
	double y[]=new double[N];
	for(int i=0;i<N;i++) {
		x[i]=sc.nextDouble();
		y[i]=sc.nextDouble();
	}
	double ans=0;
	for(int i=0;i<N-1;i++) {
		for(int j=i+1;j<N;j++) {
			ans+=Math.sqrt((x[i]-x[j])*(x[i]-x[j])+(y[i]-y[j])*(y[i]-y[j]))*2;
		}
	}
	System.out.println(ans/N);
}
}