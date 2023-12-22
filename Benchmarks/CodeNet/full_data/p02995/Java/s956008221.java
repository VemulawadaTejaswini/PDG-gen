import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

	    Scanner scanner = new Scanner(System.in);
	    long line1 = scanner.nextLong();
	    long line2 = scanner.nextLong();
	    long line3 = scanner.nextLong();
	    long line4 = scanner.nextLong();
	    long count = 0;
	    for (long i = line1;i <= line2;i++) {
	    	if(i % line3 != 0 && i % line4 != 0) {
	    		count++;
	    	}
	    }
	    System.out.println(count);
    }
}