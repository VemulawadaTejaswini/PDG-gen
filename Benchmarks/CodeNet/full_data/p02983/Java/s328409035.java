import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			final int MOD = 2019;
			
			int L = scan.nextInt();
			int R = scan.nextInt();
			
			if(L/MOD==R/MOD){
				int start = L%MOD;
				int last = R%MOD;
				int minmod = 2018;
				
				for(int i =start;i<=last-1;i++) {
					for(int j = start+1;j<=last;j++){
						int c = i*j%MOD;
						if(minmod>c) {
							minmod=c;
						}
						
					}
				}
				
				
				System.out.println(minmod);
				
				
				
			}else{
				
				
				System.out.println(0);
			}
			
			
		}
		
		
	}
		
	

}
