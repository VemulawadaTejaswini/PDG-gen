import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			long H = Integer.parseInt(sc.next());
			long W = Integer.parseInt(sc.next());
			
			System.out.println((H*W+1)/2);
		}	
	}
}