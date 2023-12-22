import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		double[] x = new double[n];
		String[] u = new String[n];
		
		for(int i = 0; i < n; i++) {
			x[i] = sc.nextDouble();
			u[i] = sc.next();
		}
		
		int sumjp = 0;
		int sumbt = 0;
		for(int i = 0; i < n; i++) {
			if(u[i].equals("JPY"))	sumjp += x[i];
			else	sumbt += (int)(x[i]*380000.0);
		}
		
		
		System.out.println(sumjp + sumbt);
		
		sc.close();
	}

}
