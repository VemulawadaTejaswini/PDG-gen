import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

	    Scanner scanner = new Scanner(System.in);
	    int line1 = scanner.nextInt();
	    int line2 = scanner.nextInt();
	    int minNum = line2;
	    int azi = 0;
	    boolean flg = false;
	    for (int i = 0; i < line1; i++) {
	    	if (minNum < 0) {
		    	minNum = Math.max(minNum, line2);	    		
	    	} else {
		    	minNum = Math.min(minNum, line2);	
	    	}
	    	azi = azi + line2;
	    	if (line2 == 0) {
	    		flg = true;
	    	}
	    	line2++;
	    }
	    if (flg) {
		    System.out.println(azi);	
	    } else {
	    	System.out.println(azi - minNum);
	    }
    }
}