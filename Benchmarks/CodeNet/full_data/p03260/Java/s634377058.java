

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		String output = "No";
		
		for(int C=1; C<=3; C++) {
			if(A*B*C % 2 == 1) {
				output = "Yes";
			}
		}
		
		System.out.println(output);
			
	}

}
