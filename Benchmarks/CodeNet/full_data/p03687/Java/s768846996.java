import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Map<Character, List<Integer>> posMap = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
        	char c = s.charAt(i);
        	if(!posMap.containsKey(c))
        		posMap.put(c, new ArrayList<>());
        	posMap.get(c).add(i);
        }

        int min = s.length();
        for(List<Integer> list : posMap.values()) {
        	int maxDist = 0;
        	int prev = -1;
        	for(int i = 0; i < list.size(); i++) {
        	    int dist = Math.abs(list.get(i) - prev - 1);
        		maxDist = Math.max(maxDist, dist);
        		prev = list.get(i);
        	}
        	maxDist = Math.max(maxDist, Math.abs(s.length() - prev - 1));

        	min = Math.min(min, maxDist);
        }
        System.out.println(min);
    }
}
