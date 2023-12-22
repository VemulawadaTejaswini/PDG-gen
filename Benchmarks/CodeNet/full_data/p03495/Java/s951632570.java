import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.Map.Entry;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Main{
	
	public static void main(String[] args) throws IOException{
		//File file = new File("input.txt");
		//Scanner in = new Scanner(file);
		
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int K = in.nextInt();
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i = 0; i < N; i++){
			int a = in.nextInt();
			Integer count = map.get(a);
			if(count == null) map.put(a, 1);
			else map.put(a, count+1);
		}
		
		if(map.size() <= K){
			System.out.println(0);
			return;
		}
		
		List<Entry<Integer, Integer>> listEntries = new ArrayList<Entry<Integer, Integer>>(map.entrySet());
        
        Collections.sort(listEntries, new Comparator<Entry<Integer, Integer>>() {
            public int compare(Entry<Integer, Integer> obj1, Entry<Integer, Integer> obj2) {
                return obj2.getValue().compareTo(obj1.getValue());
            }
        });
        
        int ans = 0;
        for(int i = K; i < listEntries.size(); i++) {
        	Entry e = listEntries.get(i);
        	ans += (int)e.getValue();
            //System.out.println(e.getKey() + " : " + e.getValue());
        }
        System.out.println(ans);
	}
}