import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String base = getString(sc.next().toCharArray());
		String next = getString(sc.next().toCharArray());
		if (base.equals(next)) {
		    System.out.println("Yes");
		} else {
		    System.out.println("No");
		}
	}
	
	static String getString(char[] arr) {
	    char[] ans = new char[arr.length];
	    HashMap<Character, Character> map = new HashMap<>();
	    char now = 'A';
	    for (int i = 0; i < arr.length; i++) {
	        if (map.containsKey(arr[i])) {
	            ans[i] = map.get(arr[i]);
	        } else {
	            ans[i] = now;
	            map.put(arr[i], now);
	            now = (char)(now + 1);
	        }
	    }
	    return new String(ans);
	}
}
