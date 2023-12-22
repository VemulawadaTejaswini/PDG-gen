import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
 
        // tenka1_2018_a
        if (s.length() == 2) {
        	System.out.println(s);
        } else {
        	StringBuilder sb = new StringBuilder(s);
        	System.out.println(sb.reverse());
        }
 
	}
}