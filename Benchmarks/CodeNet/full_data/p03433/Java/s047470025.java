import java.util.Scanner;

public class CodeForces {
	
		public static void main(String[] args){
			
			Scanner s = new Scanner(System.in);
			int n = s.nextInt();
			int a = s.nextInt();
			
			int res = n%500;
			
			if(res<=a)
				System.out.println("Yes");
			else
				System.out.println("No");	
			
			s.close();
		}		
}