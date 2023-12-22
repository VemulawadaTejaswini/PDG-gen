import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.*;
import java.util.Map.Entry;

public class Main{
	
	public static void main(String[] args) throws IOException{
		//File file = new File("input.txt");
		//Scanner in = new Scanner(file);
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i = 0; i < N; i++){
			int a = in.nextInt();
			for(int j = -1; j <= 1; j++){
				Integer count = map.get(a+j);
				if(count == null) map.put(a+j, 1);
				else map.put(a+j, count+1);
			}
		}
		
		List<Entry<Integer, Integer>> listEntries = new ArrayList<Entry<Integer, Integer>>(map.entrySet());
        
        Collections.sort(listEntries, new Comparator<Entry<Integer, Integer>>() {
            public int compare(Entry<Integer, Integer> obj1, Entry<Integer, Integer> obj2) {
                return obj2.getValue().compareTo(obj1.getValue());
            }
        });
        
        System.out.println(listEntries.get(0).getValue());
	}
}
