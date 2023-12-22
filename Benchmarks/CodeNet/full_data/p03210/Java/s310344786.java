import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Main {
	public static void main(String args[]) throws InterruptedException {
		    Scanner sc = new Scanner(System.in);	
			
			int n = sc.nextInt();
			if (n == 3) {
				System.out.println("YES");
			}else if (n == 5) {
				System.out.println("YES");
			}else if (n == 7){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}

		    sc.close(); }

	public static boolean isEven(int n ) {
		if (n % 2 == 0) {
			return true;
		}else{
			return false;
		}
	}
}