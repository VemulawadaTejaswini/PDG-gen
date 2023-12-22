

import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	String str = input.nextLine();
    	String ans = "No";
    	int cnt = 1;
    	for (int i = 0; i < str.length(); i++) {
    		char ch = str.charAt(i);
    		if ((i+1) == str.length()) {
    			break;
    		}

    		if (ch==str.charAt(i + 1)) {
    			cnt++;
    		}else {
    			cnt = 0;
    		}
    		if (cnt == 4) {
    			ans = "Yes";
    			break;
    		}
    	}
    	System.out.println(ans);
    }
}

