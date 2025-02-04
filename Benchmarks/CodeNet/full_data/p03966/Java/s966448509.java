/* Filename: ARC062C.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class ARC062C {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int N = input.nextInt();
			long T = input.nextLong(), A = input.nextLong();
			
			for(int i = 2; i <= N; ++i){
				int Ti = input.nextInt();
				int Ai = input.nextInt();
				long mul = Math.max(T / Ti, A / Ai);
				
				long newT = Ti * mul;
				long newA = Ai * mul;
				if(newT < T || newA < A){
					newT += Ti;
					newA += Ai;
				}
				
				
				T = newT;
				A = newA;
			}
			
			System.out.println(T + A);
		}
	}

}
