import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		partB100();
	}
	
	
	public static void partB100() {
		Scanner scB = new Scanner(System.in);
		int D = scB.nextInt();
		int N = scB.nextInt();
		
		if(D == 0) {
			System.out.println(N);
		}else if(D == 1) {
			System.out.println(N * 100);
		}else if(D == 2) {
			System.out.println(N * 10000);
		}
	}
}