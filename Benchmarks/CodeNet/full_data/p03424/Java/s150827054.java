import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		boolean A = false;
		for(int i=0; i<N; i++) {
			String C = sc.next();
			if(C.contains("Y")) {
				A = true; 
				break;
			}
		}
		System.out.println(A ? "Four" : "Three");
	}
}