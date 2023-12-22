
import java.util.Scanner;

public class Main{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		
		int a = N/2;
		
		if (N%2 == 0 ) {
			
			System.out.print(a);
		}else{
			System.out.print(a + 1);

		}

	}
	
}


