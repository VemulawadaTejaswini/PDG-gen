package dd;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner scan = new Scanner(System.in);
				String str = "keyence";
				String test = scan.next();
				char[] strArray = str.toCharArray();
				
				char[] testArray = test.toCharArray();
				
				int strpointer = 0;
				int testpointer = 0;
				int times = 0;
				boolean end = false;
				if(testArray.length != 0) {
					for(;strpointer < strArray.length;) {
						
						for(; testpointer<testArray.length;) {
							if(strArray[strpointer]== testArray[testpointer]) {
								
								testpointer++;
								strpointer++;
								break;
							}else {
								testpointer++;
								times++;
							}
							
							if(testpointer == testArray.length) {
								end = true;
							}
						}
						
						if(end) {
							break;
						}
						
					}
				}else {
					System.out.println("NO");
				}
				
				
				if(strpointer == strArray.length && times < 2) {
					System.out.println("YES");
				}else {
					System.out.println("NO");
				}
		
	}

}