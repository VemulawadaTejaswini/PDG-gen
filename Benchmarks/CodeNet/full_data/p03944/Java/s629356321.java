import java.util.Scanner;


	public class Main {
		
		

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
	        
			int w = sc.nextInt();
			int h = sc.nextInt();
			int n = sc.nextInt();
			
			int xi = 0;
			int yi = 0;
			int x;
			int y;
			int a;
			
			for(int i=0;i<n;i++) {
				x = sc.nextInt();
				y = sc.nextInt();
				a = sc.nextInt();
				
				if(a==1) {
					xi = x;
				}
				if(a==2) {
					w = x;
				}
				if(a==3) {
					yi = y;
				}
				if(a==4) {
					h = y;
				}
				
			}
			
			if(w>xi&&h>yi) {
				System.out.println((w-xi)*(h-yi));
			}else {
				System.out.println(0);
			}
		}
	}
