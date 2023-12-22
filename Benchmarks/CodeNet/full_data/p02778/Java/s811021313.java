
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
	Scanner w = new Scanner ( System.in) ;
	String s = w.next();;
	int len= s.length();
	StringBuilder sb = new StringBuilder();
	int i = 0 ; 
	while (i  < len) { 
		sb.append("x"); 
		i ++ ;
	}
	System.out.print(sb);
	}
}
