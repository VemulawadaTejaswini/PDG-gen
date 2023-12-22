
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner inPut = new Scanner(System.in);
		int row = inPut.nextInt();
		int column = inPut.nextInt();
		int K = inPut.nextInt();
		if(row == column && column ==K){
			System.out.println("Yes");
		}
		else if(row == column && column != K){
			System.out.println("No");
		}
		else {
			
		}
		
		
	}

}