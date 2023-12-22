import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int max = sc.nextInt();
		
		long result = 0;
		
		for(long l = 1; l <= max; l++){
		
			if(!(l%15 == 0) && !(l%5 == 0) && !(l%3 == 0)) {
				
				result += l;
				
			}
		
        }
          
		sc.close();
		
      	System.out.println(result);
      
	}
	
}