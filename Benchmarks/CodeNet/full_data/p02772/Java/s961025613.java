
import java.util.Scanner;


public class Main{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		for (int i= 1; i < N; i++){
			
			int a = sc.nextInt();

			if (a%2 == 0) {

				if (a%3 == 0) {
					System.out.print("APPROVED");
				}else{
					if(a%5 == 0) {
						System.out.print("APPROVED");
					}else {
						System.out.print("DENIED");
					}
					
				}
				
			}
		}
			
	}

}

