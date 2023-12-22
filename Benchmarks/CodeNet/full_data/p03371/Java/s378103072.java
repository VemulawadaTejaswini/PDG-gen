import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			int A = scan.nextInt();
			int B = scan.nextInt();
			int C = scan.nextInt();
			int X = scan.nextInt();
			int Y = scan.nextInt();
			
			int m = Math.min(A, B);
			int l = Math.max(A, B);
			
			int minx = 0;
			int miny = 0;
			int minz = 0;
			
			int saisyou = 2*C*Math.max(X, Y);
			
			for(int i =0;i<=Math.min(X, Y);i++) {
				
				int ne = A*(X-i)+B*(Y-i)+2*C*i;
				//System.out.println(ne);
				if(saisyou>ne) {
					saisyou=ne;
					minx  = (X-i);
					miny  = (Y-i);
					minz = 2*i;
					
				}
				
			}
			
			
			
			System.out.println(saisyou);
			//System.out.println(minx);
			//System.out.println(miny);
			//System.out.println(minz);
			
			
		}	
	}
}
