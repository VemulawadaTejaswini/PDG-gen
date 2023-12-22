import java.util.Scanner;
import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String S = scan.next();
		String T = scan.next();
		for(int i = 0; i< n; i++){
		    char s = S.charAt(i);
		    char t = T.charAt(i);
		    System.out.print(s);
		    System.out.print(t);
		}
		
	}
}