import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
public class Test {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
	    String a = scan.next();
	    String b = scan.next();
	    String c = scan.next();
	    int ab[] = new int[3];
	    ab[0] = Integer.valueOf(a).intValue();
	    ab[1] = Integer.valueOf(b).intValue();
	    ab[2] = Integer.valueOf(c).intValue();
	    Arrays.sort(ab);
	    if(ab[0] == 5 && ab[1] == 5 && ab[2] == 7) {
	    	System.out.println("YES");
	    } else {
	    	System.out.println("NO");
	    }
	}
}
