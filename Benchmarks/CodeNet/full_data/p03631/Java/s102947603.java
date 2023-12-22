import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		    Scanner sc = new Scanner(System.in);

		    String s = sc.nextLine();
		    String n = s.substring(1, 2);
		    int si = Integer.parseInt(s);
		    int ni = Integer.parseInt(n);
		    
		    if((si - ni * 10) % 101 == 0) {
		    	System.out.println("Yes");
		    }
		    else {
		    	System.out.println("No");
		    }
		    
		    sc.close(); }
}