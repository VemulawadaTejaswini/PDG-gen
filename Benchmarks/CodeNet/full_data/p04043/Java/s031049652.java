/* Filename: ABC042A.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			String[] numberStr = input.nextLine().split(" ");
			int count5 = 0, count7 = 0;
			
			for(int i = 0; i < numberStr.length; ++i){
				if(Integer.valueOf(numberStr[i]) == 5){
					++count5;
				}
				
				if(Integer.valueOf(numberStr[i]) == 7){
					++count7;
				}
			}
			
			if(count5 == 2 && count7 == 1){
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}

}
