
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int leftSpaceInA = a - b;
		if(leftSpaceInA > c) {
			System.out.println(0);
		}else {
			System.out.println(c - leftSpaceInA);
		}


		

		
		

		
		
	}	

}

