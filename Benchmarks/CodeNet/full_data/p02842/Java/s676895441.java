import java.util.Scanner;


	public class Main {
		
		

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
	        
			int n = sc.nextInt();
			
			for(int i=1;i<=n;i++) {
				double x = Math.floor(i*1.08);
				if(x==n) {
					System.out.println(i);
					return;
				}
			}
			
			System.out.println(":(");
		}
	}
