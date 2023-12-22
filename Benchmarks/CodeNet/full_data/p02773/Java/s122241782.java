import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
  	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		Map<String, Integer> map = new TreeMap<String, Integer>();

		for(int i=0;i<N;i++){

			String S = sc.next();
			Integer sn = map.get(S);

			if(sn == null){
				map.put(S, 0);
			}
			else{
				map.put(S, sn+1);
			}
		}


		List<Map.Entry<String, Integer>> list_entries = new ArrayList<Map.Entry<String, Integer>>(map.entrySet());

        Collections.sort(list_entries, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> obj1, Map.Entry<String, Integer> obj2)
            {
                return obj2.getValue().compareTo(obj1.getValue());
            }
        });


		int smax = list_entries.get(0).getValue();

        //Object[] mapkey = map.keySet().toArray();
        //Arrays.sort(mapkey);

        for (String s : map.keySet())
        {
        	if(smax == map.get(s)){
                System.out.println(s);
        	}
        }

	}
}