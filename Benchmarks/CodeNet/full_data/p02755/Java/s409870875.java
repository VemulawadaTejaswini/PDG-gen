import java.util.Scanner;

	public class Main {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			for(int i=2;i<1100;i++) {
				if((int)(i*0.08)==a  && (int)(i*0.1)==b) {
					System.out.println(i);
					return;
				}
			}
			
			
			System.out.println(-1);
			
		}

	}