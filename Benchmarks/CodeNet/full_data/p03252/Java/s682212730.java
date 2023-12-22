import java.util.*;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		String s = sc.next();
		String t = sc.next();
		sc.close();
		boolean f = true;
		HashMap<Character, Character> c1 = new HashMap<>();
		HashMap<Character, Character> c2 = new HashMap<>();
		for(i=0;i<s.length();i++) {
			if(c1.containsKey(s.charAt(i))) {
				if(!c1.get(s.charAt(i)).equals(t.charAt(i))) {
					f = false;
					break;
				}
			} else {
				c1.put(s.charAt(i), t.charAt(i));
			}
			if(c2.containsKey(t.charAt(i))) {
				if(!c2.get(t.charAt(i)).equals(s.charAt(i))) {
					f = false;
					break;
				}
			} else {
				c2.put(t.charAt(i), s.charAt(i));
			}
		}
		out.println(f?"Yes":"No");
	}
}
