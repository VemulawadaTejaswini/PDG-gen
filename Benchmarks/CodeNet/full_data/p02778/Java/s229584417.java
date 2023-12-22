
import java.util.*;
public class Main {
	public static void main(String []args) {
		Scanner input = new Scanner(System.in);
		int len = input.next().length();
		String s = "";
		for(int i = 0; i < len; ++i) {
			s += 'x';
		}
		System.out.println(s);
		input.close();
		
	}
}












