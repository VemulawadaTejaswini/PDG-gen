import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Main {
	public static void main(String args[]){
		    Scanner sc = new Scanner(System.in);	
			
			String s = sc.next();
			String ss = s.substring(0,1);
			String tmp = s.replaceAll(ss,"a");
			String a = "";
			int pricnt = 0;

			for (int i = 0; i < s.length(); i++) {
				a = a + "a";
			}
			if (tmp.equals(a)) {
				System.out.println("-1 -1");
			}else{
				for (int i = 0; i < s.length()-1; i++) {
					if (i == 0) {
						if (s.charAt(i) == s.charAt(i+1) 
								&& s.charAt(i) != s.charAt(i+2)) {
							System.out.println(1 + " " + 3);
							pricnt++;
						}
					}else if(i != s.length()-1){
						if (s.charAt(i)==s.charAt(i+1)) {
							System.out.println(i + " " + (i+2));
							pricnt++;
						}
					}
					if (pricnt == 1) {
						break;
					}
				}
				if (pricnt == 0) {
					for (int i = 0; i < s.length()-2; i++) {
						if (s.charAt(i) == s.charAt(i+2)) {
							pricnt++;
							System.out.println((i+1) +" " + (i+3));
						}
						if (pricnt == 1) {
							break;
						}
					}
				}

				if (pricnt == 0) {
					System.out.println("-1 -1");
				}

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