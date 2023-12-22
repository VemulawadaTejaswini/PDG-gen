package atcoder.agc034.a;

import java.util.Scanner;

/**
 * 
 * @author tmikami
 * 
 * solution:
 * 
 * prerequisite :
 *  if C=D -> "No" (impossible)
 *  if one of A-th, B-th, C-th, D-th place is "#" -> "No" (impossible)
 * 
 * case 1) C < D :
 *   if "##" block does not exist in the interval (A,C) and (B,D): -> "Yes"
 *   else: -> "No"
 *  
 * case 2) C > D :
 *   if "..." block does not exist in the interval [B-1,D+1] -> "No"
 *   else: -> same as case 1)
 *
 */
public class Main {

	/**
	 * problem solver
	 */
	public static class Problem {

		/**
		 * paramters
		 */
		private int N;
		private int A;
		private int B;
		private int C;
		private int D;
		private String S;

		/**
		 * constructor
		 */
		Problem() {
		}

		/**
		 * standard input
		 */
		void input() {
			Scanner sc = new Scanner(System.in);
			N = sc.nextInt();
			A = sc.nextInt();
			B = sc.nextInt();
			C = sc.nextInt();
			D = sc.nextInt();
			S = sc.next();
			sc.close();
			
			S = "_" + S;
		}


		/**
		 * solver
		 */
		void solve() {
			
			// prerequisite
			if ( C == D || S.charAt(A) == '#' || S.charAt(B) == '#' || S.charAt(C) == '#' || S.charAt(D) == '#') {
				System.out.println("No");
				return;
			}
			
			// case 2
			if ( C > D) {
				
				// check if "..." block exists in the interval [B-1,D+1] 
				boolean flag = false;
				for (int i=B-1; i<=D-1; i++) {
					// boost
					if ('#' == S.charAt(i+2)) {
						i+=2;
						continue;
					}

					if ("...".equals(S.substring(i,i+3))) {
						flag = true;
						break;
					}
				}
				if (!flag) {
					System.out.println("No");
					return;					
				}
			}
			
			// case 1
			// check if "##" block does not exist in the interval (A,C) and (B,D)
			boolean flag = true;
			for (int i=A+1;i<Math.max(C, D);i++) {
				if (i>=C && i<=B) continue;
				
				if ("##".equals(S.substring(i,i+2))) {
					flag = false;
					break;
				}				
				
			}
			
//			for (int i=A+1;i<C;i++) {
//				if ("##".equals(S.substring(i,i+2))) {
//					flag = false;
//					break;
//				}
//			}
//			for (int i=B+1;i<D;i++) {
//				if ("##".equals(S.substring(i,i+2))) {
//					flag = false;
//					break;
//				}
//			}
			
			if (flag) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
			
		}

	}

	public static void main(String args[]) {

		Problem p = new Problem();

		p.input();

		p.solve();
	}
}
