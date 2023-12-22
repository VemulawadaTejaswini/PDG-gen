import java.util.*;

public class Main
{
    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	String s = in.nextLine();
	if (s.length() < 26) {
	    HashSet<Character> t = new HashSet<>();
	    for (int i = 0; i < s.length(); i++) {
		t.add(s.charAt(i));
	    }
	    for (int i = 0; i < 26; i++) {
		if(!t.contains((char)(i + 'a'))) {
		    System.out.println(s += (char)(i + 'a'));
		    break;
		}
	    }
	} else {
	    for (int i = 1; i < s.length(); i++) {
		if(s.charAt(i) - s.charAt(i-1) > 1) {
		    char x = s.charAt(i - 1);
		    s = s.substring(0, i - 1);
		    System.out.println(s + (char)(x + 1));
		    System.exit(0);
		}
	    }
	    System.out.println(-1);
	}
    }
}
