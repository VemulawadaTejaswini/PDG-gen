import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= Integer.parseInt(sc.next()),k=Integer.parseInt(sc.next());
		int[] p=new int[n];
		double[] e=new double[n];
		double count=0,flag=0,sum=0,max=0;
		for(int i=0;i<n;i++) {
			p[i]=Integer.parseInt(sc.next());
		}
		for(int i=0;i<n;i++) {
			e[i]=(0.5*p[i]*(p[i]+1))/p[i];
		}
		for(int i=0;i<=n-k;i++) {
			for(int j=i;j<k+i;j++) {
				sum+=e[j];
			}
			max=Math.max(max, sum);
			sum=0;
		}
		System.out.println(max);
	}

}
