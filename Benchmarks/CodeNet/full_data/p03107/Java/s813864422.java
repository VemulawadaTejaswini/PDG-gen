import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		ArrayList<Character> c = new ArrayList<>();
		int a=0,b=0;
		for(int i=0 ; i<s.length(); i++) {
			c.add(s.charAt(i));
		}
		for(int i=0 ; i<c.size() ; ++i) {
			if(c.get(i) == '0') {
				a++;
			}else {
				b++;
			}
		}
		if(a>=b) {
			System.out.println(b*2);
		}else {
			System.out.println(a*2);
		}
    }
}
