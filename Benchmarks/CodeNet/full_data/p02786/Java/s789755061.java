import java.math.*;
import java.util.*;

	public class Main {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			long h = sc.nextLong();
			
			int attack = 1;
			long sumattack = 1;
			
			for(;;) {
				
				h = h/2;
				attack = attack*2;
				sumattack += attack;
				if(h==0) {
					System.out.println(sumattack);
					return; 
				}
				
				
			}
			
			
		}

	}