import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		
		for (int com = M-1 ; com > N ; com++){
			if( M%com == 0){	
				System.out.println(com);
			}
		}
		System.out.println(1);
		
	}
}