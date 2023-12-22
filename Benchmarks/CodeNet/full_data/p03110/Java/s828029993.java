import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
		int n = sc.nextInt();
		
		double sum = 0;
		for (int i=0; i<n; i++) {
			double a = sc.nextDouble();
			String s = sc.next();
			if (s.equals("JPY")) sum += a;
			else sum += a * 380000.0;
		}
		
		System.out.println(sum);
		
	}
}
