import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	try {
    		final String s = sc.next();
    		final String t = sc.next();
    		Set<Character> sSet = new HashSet<>();
    		Set<Character> tSet = new HashSet<>();
    		for (int i=0; i<s.length(); i++) {
    			sSet.add(s.charAt(i));
    		}
    		for (int i=0; i<t.length(); i++) {
    			tSet.add(t.charAt(i));
    		}
    		if (!sSet.containsAll(tSet)) {
    			System.out.println("-1");
    			System.exit(0);
    		}

    		int[][] map = new int[26][26];
    		String tmpString = s + s;
    		Set<Character> iRemains = new HashSet<>();
			tSet.forEach(ch -> {iRemains.add(ch);});
    		for (int i=0; i<tmpString.length() && !iRemains.isEmpty(); i++) {
    			iRemains.remove(tmpString.charAt(i));
    			int fromIndex = tmpString.charAt(i) - 'a';
    			Set<Character> jRemains = new HashSet<>();
    			tSet.forEach(ch -> {jRemains.add(ch);});
    			for (int j=i+1; j<tmpString.length() && !jRemains.isEmpty(); j++) {
    				jRemains.remove(tmpString.charAt(j));
    				int toIndex = tmpString.charAt(j) - 'a';
    				if (map[fromIndex][toIndex] == 0) {
    					map[fromIndex][toIndex] = j-i;
    				}
    			}
    		}

    		long counter = s.indexOf(t.codePointAt(0)) + 1;
    		for (int i=0; i<t.length()-1; i++) {
    			counter += map[t.codePointAt(i) - "a".codePointAt(0)][t.codePointAt(i+1) - "a".codePointAt(0)];
    		}
    		System.out.println(counter);

    	} finally {
    		sc.close();
    	}
    }
}

