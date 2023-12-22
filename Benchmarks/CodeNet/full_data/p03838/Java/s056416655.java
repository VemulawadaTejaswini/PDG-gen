import java.util.Scanner;


	public class Main {
		
		

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			long x = sc.nextLong();
			long y = sc.nextLong();
			
			if(y==0) {
				if(x>0) {
					System.out.println(x+1);
					return;
				}else {
					System.out.println(Math.abs(x));
					return;
				}
				
			}
			
			if(x==0) {
				if(y>0) {
					System.out.println(y);
					return;
				}
				else {
					System.out.println(Math.abs(y)+1);
				}
			}
			
			if(x*y>0) {
				if(x>y) {
					System.out.println(Math.abs(x-y)+2);
					return;
				}
				else {
					System.out.println(Math.abs(x-y));
					return;
				}
			}
			
			if(x>0&&y<0&&x*(-1)>y) {
				System.out.println(Math.abs(x-y*(-1))+1);
				return;
			}
			
			System.out.println(Math.abs(x*(-1)-y)+1);
			
			
		}
		
	}
	
