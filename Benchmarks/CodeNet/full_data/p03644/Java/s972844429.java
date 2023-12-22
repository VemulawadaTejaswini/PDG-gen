import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner; 


public class Main { 
	
    public static void main(String[] args) {
    	
    	PrintWriter out = new PrintWriter(System.out);
    	Scanner in = new Scanner(System.in);
    	new Main().solve(in, out);
    	in.close();
        out.close();
    }
    
    private void solve(Scanner in, PrintWriter out) {
    	
    	int N = in.nextInt();
    	HashMap<Integer, Integer> hash = new HashMap<Integer,Integer>();
    	for(int i=1; i<=N; i++) {
    		hash.put(i, dividedCount(i));
    	}
    	
    	List<Entry<Integer, Integer>> list_entries = new ArrayList<Entry<Integer, Integer>>(hash.entrySet());
        Collections.sort(list_entries, new Comparator<Entry<Integer, Integer>>() {
            public int compare(Entry<Integer, Integer> obj1, Entry<Integer, Integer> obj2) {
                // 4. 昇順
                return obj2.getValue().compareTo(obj1.getValue());
            }
        });
        

        System.out.println(list_entries.get(0).getKey());
    	
    	
    }
    
    private int dividedCount(int n) {
    	if(n%2!=0 || n<=1) 
    		return 0;
    	
    	return 1+dividedCount(n/2); 
    	    	
    }
   
}