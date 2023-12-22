import java.util.*;
 
public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int A = sc.nextInt();
    	int B = sc.nextInt();
    	int K = sc.nextInt();
    	StringBuilder sb = new StringBuilder();
    	Set<Integer> set = new HashSet<>();
    	for (int i = A; i <= B; i++) {
    		set.add(i);
    	}
    	List<Integer> list = new ArrayList<>(set);
    	Collections.sort(list);
    	for (int i = 0; i < list.size(); i++) {
    		if (i < K || list.size() - 1 - K < i) {
    			sb.append(list.get(i) + "\n");
    		}
    	}
    	System.out.println(sb);
    }
}