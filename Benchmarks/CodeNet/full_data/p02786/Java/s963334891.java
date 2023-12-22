import java.math.*;
import java.util.*;

	public class Main {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			long h = sc.nextLong();
			int count =0;
			long sumattack = 0;
			
			for(;;) {
				count++;
				
				h = h/2;
				sumattack += Math.pow(2, (count-1));
				if(h==0) {
					System.out.println(sumattack);
					return; 
				}
				
				
			}
			
			
		}

	}