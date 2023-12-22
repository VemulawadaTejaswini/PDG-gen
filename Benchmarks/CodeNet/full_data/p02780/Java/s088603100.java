
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		double[] p=new double[n];
		for(int i=0;i<n;i++) {
			int a=sc.nextInt();
			double c=0;
			for(int j=1;j<=a;j++){
				c+=j;
			}
			p[i]=(double)(c/a);
		}
		double c=0;
		for(int i=0;i<=n-k;i++) {
			double d=0;
			for(int j=i;j<i+k;j++) {

				d+=p[j];
			}
			c=Math.max(d,c);
		}


		System.out.println(c);




	}

}
