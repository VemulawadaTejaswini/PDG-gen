import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		double x[] = new double[n];
		String u[] = new String[n];
		for(int i=0; i<n;i++) {
			x[i]=scan.nextDouble();
			u[i]=scan.next();
		}
		scan.close();
		long sum = 0;
		for(int i=0; i<n;i++) {
			if(u[i].equals("BTC")) {
				sum+=x[i]*380000;
			}else {
				sum+=x[i];
			}
		}
		System.out.println(sum);
	}

}