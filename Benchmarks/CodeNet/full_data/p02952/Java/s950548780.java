import java.util.*;

public class Main{
		
		public static boolean func(int n) {
			
			int count = 0;
			while(n != 0) {
				
				n = n/10;
				count++;
			
			}
			
			if(count % 2 == 1){
				
				return true;
				
			} else {
				
				return false;
				
			}
			
		}
		
		
		public static void main(String args[]){
	
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
	
			int count = 0;
			for(int i = 1; i <= n; i++){
			
			if(func(i)){
				
					count++;
				
				}
			
			}
			
			System.out.println(count);
			
		}
}