import java.util.*;

public class Main{
		
		public static void main(String args[]){
	
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			
			int amountLeftInBottle1 = a - b;
			int amountRemainingInBottle2 = c - amountLeftInBottle1;
			
			if(amountRemainingInBottle2 <= 0){
				
				amountRemainingInBottle2 = 0;
				
			}
			
			System.out.println(amountRemainingInBottle2);
			
		}
}