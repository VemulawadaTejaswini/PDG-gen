import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
//		String s = sc.next();
//		int n = sc.nextInt();
		int n = sc.nextInt();

		double[] dArray = new double[n];
		for(int i=0;i<n;i++) {
			dArray[i] = sc.nextDouble();
		}

		double ans = 0;

		for(int i=1;i<=100;i++) {
			double sum = 0;
			for(int j=0;j<n;j++) {
				sum += Math.pow(dArray[j]-i, 2);
			}
			if(sum<ans || i==1) {
				ans = sum;
			}
		}

		System.out.println((int)ans);

	}
}
