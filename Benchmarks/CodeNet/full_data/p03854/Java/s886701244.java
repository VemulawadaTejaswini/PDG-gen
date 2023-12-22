//第 4 問: ABC 087 B - Coinsi (200 点)

import java.util.Scanner;

public class Main{

	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		String S = scan.next();

		int count = S.length()/5 + 1;

		String A = "";
		String B = "";
		String C = "";

		while(true) {

			int counter = S.length();

			if (counter >6) {
			A = S.substring(0,5);
			B = S.substring(0,6);
			C = S.substring(0,7);

				if (C.equals("dreamer")){

					if (counter == 7) {
						System.out.println("YES");
						break;
					}
					else {
						if(S.substring(7,8).equals("a")) {
							S = S.substring(5);
						}
						else {
							S = S.substring(7);
						}
					}
				}
				else if(B.equals("eraser")){

					S = S.substring(6);

				}
				else if ((A.equals("dream")) || (A.equals("erase"))) {

					S = S.substring(5);

				}
				else {
					System.out.println("NO");
					break;
				}

			}
			else if (counter == 6) {

				if(S.equals("eraser")) {
					System.out.println("YES");
					break;
				}
				else {
					System.out.println("NO");
					break;
				}
			}
			else if (counter == 5) {
				if ((A.equals("dream")) || (A.equals("erase"))) {
					System.out.println("YES");
					break;
				}
				else{
					System.out.println("NO");
					break;
				}
			}
			else {
				System.out.println("NO");
				//System.out.println("2");
				break;
			}

			//System.out.println(A + B + C);



		}

	}
}

