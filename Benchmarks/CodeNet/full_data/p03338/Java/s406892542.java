import java.util.*;

public class Main {
    public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
    	int n = scan.nextInt();
    	String s = scan.next();
    	int ans = 0;
    	for (int i=1;i < n;i++) {
    		int cnt = 0;
    		String x = s.substring(0, i);
    		String y = s.substring(i, n);
    		
    		Set<Character> xSet = new HashSet<>();
    		for (char c : x.toCharArray()) xSet.add(c);
    		Set<Character> ySet = new HashSet<>();
    		for (char c : y.toCharArray()) ySet.add(c);
    		for (char c : ySet) if (xSet.contains(c)) cnt++;
    		if (cnt > ans) ans = cnt;
    	}
    	System.out.println(ans);
    }
}