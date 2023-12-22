import java.util.Scanner;

public class Main {

		public static void main(String[] args) {
			
	        Scanner scan = new Scanner(System.in);
	        String line =  scan.next();
            int number = Integer.parseInt(line);
            int quotient = number/6;
			int remainder = number%6;
			if (number<=6){
				System.out.print(1);
			} 
			
			switch (remainder){
			case 0:
				System.out.print(quotient);
				break;
				
			default :
				System.out.print(quotient+1);
			}
			
}
}