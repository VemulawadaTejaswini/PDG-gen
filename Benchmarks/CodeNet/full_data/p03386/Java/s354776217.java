import java.util.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(in);
	    int A = sc.nextInt(), B = sc.nextInt(), K = sc.nextInt();
	    Set<Integer> set = new HashSet<>();
	    
	    for (int i=0; i<Math.min(K,B-A+1); i++) {
	        set.add(A+i);
	        set.add(B-i);
	    }
	    ArrayList<Integer> list = new ArrayList<Integer>(set);
	    Collections.sort(list);
	    for (int j=0; j<list.size(); j++)
	        out.println(list.get(j));
	}
}