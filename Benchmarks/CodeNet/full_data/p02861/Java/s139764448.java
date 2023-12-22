package atcoder;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int p=1;
		double ave=0.0;
		int x[]= new int[n];
		int y[]= new int[n];
		for(int i=0;i<n;i++) {
			x[i]=sc.nextInt();
			y[i]=sc.nextInt();
		}
		double l[][]=new double [n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				l[i][j]=Math.sqrt((x[i]-x[j])*(x[i]-x[j])+(y[i]-y[j])*(y[i]-y[j]));
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				ave+=l[i][j];
			}
		}
		ave=ave/n;
		System.out.println(ave);
	}

}
