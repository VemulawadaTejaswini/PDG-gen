import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.Map.Entry;

public class Main{
	
	public static void main(String[] args) throws IOException{
		//File file = new File("input.txt");
		//Scanner in = new Scanner(file);
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		HashMap<Integer, Integer> oddSet = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> evenSet = new HashMap<Integer, Integer>();
		
		for(int i = 0; i < n; i++){
			int v = in.nextInt();
			if(i % 2 == 0){
				Integer count = oddSet.get(v);
				if(count == null) oddSet.put(v, 1);
				else oddSet.put(v, count+1);
			}else{
				Integer count = evenSet.get(v);
				if(count == null) evenSet.put(v, 1);
				else evenSet.put(v, count+1);
			}
		}
		
		List<Entry<Integer, Integer>> listOddEntries = new ArrayList<Entry<Integer, Integer>>(oddSet.entrySet());
        Collections.sort(listOddEntries, new Comparator<Entry<Integer, Integer>>() {
            public int compare(Entry<Integer, Integer> obj1, Entry<Integer, Integer> obj2) {
                return obj2.getValue().compareTo(obj1.getValue());
            }
        });
        
        List<Entry<Integer, Integer>> listEvenEntries = new ArrayList<Entry<Integer, Integer>>(evenSet.entrySet());
        Collections.sort(listEvenEntries, new Comparator<Entry<Integer, Integer>>() {
            public int compare(Entry<Integer, Integer> obj1, Entry<Integer, Integer> obj2) {
                return obj2.getValue().compareTo(obj1.getValue());
            }
        });
        
        /*
        for(int i = 0; i < listOddEntries.size(); i++){
        	Entry e = listOddEntries.get(i);
        	System.out.println(e.getKey() + " " + e.getValue());
        }
        
        System.out.println();
        for(int i = 0; i < listEvenEntries.size(); i++){
        	Entry e = listEvenEntries.get(i);
        	System.out.println(e.getKey() + " " + e.getValue());
        }
        */
        
        Entry oddMax1 = listOddEntries.get(0);
        Entry oddMax2 = (listOddEntries.size() >= 2) ? listOddEntries.get(1) : null;
        Entry evenMax1 = listEvenEntries.get(0);
        Entry evenMax2 = (listEvenEntries.size() >= 2) ? listEvenEntries.get(1) : null;
        
        int ans = 0;
        if(oddMax1.getKey() != evenMax1.getKey()){
        	ans = n - (int)oddMax1.getValue() - (int)evenMax1.getValue();
        }else{
        	if(oddMax2 != null && evenMax2 != null){
	        	int a1 = n - (int)oddMax1.getValue() - (int)evenMax2.getValue();
	        	int a2 = n - (int)evenMax1.getValue() - (int)oddMax2.getValue();
	        	ans = Math.min(a1, a2);
        	}else{
        		if(oddMax2 != null){
        			ans = n - (int)oddMax1.getValue() - (int)evenMax2.getValue();
        		}else if(evenMax2 != null){
        			ans = n - (int)evenMax1.getValue() - (int)oddMax2.getValue();
        		}else{
        			ans = n / 2;
        		}
        	}
        }
        
        System.out.println(ans);
	}
}
