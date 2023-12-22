import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    String s = sc.next();
	    char[] c = s.toCharArray();
	    for (int i = 0; i < s.length(); i ++) {
	      if (c[i] + n > 'Z') {
	        System.out.print((char)(c[i] + n - 26));
	      } else {
	        System.out.print((char)(c[i] + n));
	      }
	    }
	    System.out.println();
	}
}