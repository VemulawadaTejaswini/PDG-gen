import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {

			int n = sc.nextInt();
			
			double[] v = new double[n];
			for(int i = 0 ; i < n ; i++ ) {
				v[i] = sc.nextDouble();
			}
			
			Arrays.sort(v);
			
			double result = v[0];
			for(int i = 1 ; i < n ; i++) {
				result = (result + v[i]) / 2;
			}
			
			System.out.println(result);
		}
	}
}
