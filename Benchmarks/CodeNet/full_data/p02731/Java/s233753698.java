import java.math.*;
import java.util.*;

	public class Main {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			int L = sc.nextInt();
			double a= L/3.0;
			double b= L/3.0;
			double v = a*b*(L-a-b);
			
			System.out.println(v);
			
		}

	}