import java.util.Scanner;

public class Main {
	public static void main(String[] args){
	    Scanner in = new Scanner(System.in);
	    int lo = in.nextInt();
	    int hi = in.nextInt();
	    in.close();
	    String sl = Integer.toBinaryString(lo);
	    String sh = Integer.toBinaryString(hi);
	    if ( (sl.length() == 32 ^ sh.length() == 32) || lo == 0 || hi == 0 ) {
	    	System.out.println("Zero");
	    } else if (sl.length() < 32) {
	    	System.out.println("Positive");
	    } else {
	    	if (sl.charAt(31) == sh.charAt(31)) {
	    		System.out.println("Negative");
	    	} else {
	    		System.out.println("Positive");
	    	}
	    }
	}
}