import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt(),k=sc.nextInt();
		int[] p=new int[n];
		double[] e=new double[n];
		double count=0,flag=0,sum=0,max=0;
		for(int i=0;i<n;i++) {
			p[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			for(int j=1;j<=p[i];j++) {
				sum+=j;
			}
			e[i]=sum*1.0/p[i];
			sum=0;
		}
		for(int i=0;i<=n-k;i++) {
			for(int j=i;j<k+i;j++) {
				sum+=e[j];
			}
			//System.out.println(sum);
			max=Math.max(max, sum);
			sum=0;
		}
		/*for(double i:e) {
			System.out.print(i+" ");
		}
		System.out.println();*/
		System.out.println(max);
	}

}
