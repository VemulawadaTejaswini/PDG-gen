import java.util.Scanner;

public class Main {
	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int t=scanner.nextInt();
		int a=scanner.nextInt();
		int h[]=new int[n];
		for(int i=0;i<n;i++) {
			h[i]=scanner.nextInt();
		}
		double min=Integer.MAX_VALUE;
		int ans=0;
		for(int i=0;i<n;i++) {
			double d=t-h[i]*0.006;
			double p=Math.abs(d-a);
			if(p<min) {
				min=p;
				ans=i;
			}
			
		}
		System.out.println(ans+1);
	}
}