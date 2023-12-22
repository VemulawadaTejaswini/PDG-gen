import java.util.*;
import static java.lang.Math.*;
 
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		char[] chars = n.toCharArray();
		for (int i=0; i<chars.length;i++) {
			if (chars[i] == '1') chars[i] = '9';
			if (chars[i] == '9') chars[i] = '1';
		}
		System.out.println(new String(chars));
	}
}