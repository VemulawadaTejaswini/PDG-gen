import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int ab[] = new int[3];
	    ab[0] = scan.nextInt();
	    ab[1] = scan.nextInt();
	    ab[2] = scan.nextInt();
	    Arrays.sort(ab);
	    if(ab[0] == 5 && ab[1] == 5 && ab[2] == 7) {
	    	System.out.println("YES");
	    } else {
	    	System.out.println("NO");
	    }
	}
}
