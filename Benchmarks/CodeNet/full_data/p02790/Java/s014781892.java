import java.math.*;
import java.util.*;
	
	public class Main {
	
		public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int b = sc.nextInt();

			StringBuilder bufab = new StringBuilder();
			StringBuilder bufba = new StringBuilder();
			

			
			for (int i=0;i<b;i++) {
				bufab.append(a);
			}
			
			
			for (int i=0;i<a;i++) {
				bufab.append(b);
			}
			
			
			String ab = bufab.toString();
			String ba = bufba.toString();
			
			if(ab.compareTo(ba)<0) {
				System.out.println(ab);
			}else {
				System.out.println(ba);
			}
			
		}
				
	}