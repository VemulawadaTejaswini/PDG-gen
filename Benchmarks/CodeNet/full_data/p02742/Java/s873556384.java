import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int H = scan.nextInt(), W = scan.nextInt();
		if(H == 1 || W == 1) {
			System.out.println(0);
		}else{
			System.out.println(Math.round(H  * W) / 2.0));
		
		}
	}
	
}