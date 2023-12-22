
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner jk = new Scanner(System.in);
		double n = jk.nextDouble();
		double[] arr = new double[(int) n];
		double den = 0.0;
		for (int i=0; i<n; i++)
		{
			arr[i] = jk.nextDouble();
			den+=(1/arr[i]);
		}
		System.out.println(1/den);
		
		
	}

}
