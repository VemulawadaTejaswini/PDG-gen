/* Filename: ABC046A.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			boolean[] hasColor = new boolean[100 + 1];
			
			for(int i = 0; i < 3; ++i){
				hasColor[input.nextInt()] = true;
			}
			
			int colorCount = 0;
			for(int i = 0; i < hasColor.length; ++i){
				if(hasColor[i]){
					++colorCount;
				}
			}
			
			System.out.println(colorCount);
		}
	}

}
