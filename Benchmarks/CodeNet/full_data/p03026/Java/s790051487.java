import java.util.*;
import java.util.Map.Entry;
import java.util.Collections;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
        Map<Integer, Integer> nodeMap = new HashMap<Integer, Integer>();
        int[] node = new int[num];
        int[] value = new int[num];
        int[] margin = new int[num-1];
        for(int i=0; i<(num-1)*2; i++){
		  int input = sc.nextInt();
          node[input-1]++;
        }
        for(int i=0; i<num; i++){
          nodeMap.put(i+1, node[i]);
		  value[i] = sc.nextInt();
        }
        List<Entry<Integer, Integer>> list_entries = new ArrayList<Entry<Integer, Integer>>(nodeMap.entrySet());
        Collections.sort(list_entries, new Comparator<Entry<Integer, Integer>>() {
            public int compare(Entry<Integer, Integer> obj1, Entry<Integer, Integer> obj2) {
                return obj2.getValue().compareTo(obj1.getValue());
            }
        });
       
        /*for(int i=0; i<value.length-1; i++) {
            for(int j=value.length-1; j>i; j--) {
                if(value[j-1] > value[j]) {
                    int tmp = value[j-1];
                    value[j-1] = value[j];
                    value[j] = tmp;
                }
             }
        }*/
        Arrays.sort(node);
        Arrays.sort(value);
        /*for(int i=0; i<num-1; i++){
          margin[i] = value[i+1] - value[i]; 
        }*/
        //Arrays.sort(margin);
        int index = 0;
        int sum = 0;
        for(Entry<Integer, Integer> entry : list_entries) {
            //System.out.println(entry.getKey() + " : " + entry.getValue());
            node[entry.getKey()-1] = value[num-1-index];
            if(index != 0) sum += value[num-1-index];
            index++;
        }
        System.out.println(sum);
        for(int i=0; i<num; i++){
		  //System.out.println(value[i]);
          System.out.print(node[i]+" ");
        }
		//System.out.println((a+b+c) + " " + s);
	}
}