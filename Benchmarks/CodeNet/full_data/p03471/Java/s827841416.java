import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			int N = scan.nextInt();
			int Y = scan.nextInt();
			
			int K = Y/10000;
			int goukei=0;
			
			for(int i =0;i<=K;i++) {
				goukei+=i;
				int g = Y-i*10000;
				int G = g/5000;
				for(int z = 0;z<=G;z++) {
					goukei+=z;
					int W= g-z*5000;
					if(i+z+W/1000==N) {
						System.out.print(i);
						System.out.print(" ");
						System.out.print(z);
						System.out.print(" ");
						System.out.println(W/1000);
						System.exit(0);
					}
					
				}
				
			}
			
			System.out.println("-1 -1 -1");
			
		}
		
		
	}
		

}
