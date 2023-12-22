import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Map<String, Integer> count = new HashMap<String, Integer>();
		for(int i = 0 ; i < N ; ++i){
			String s = sc.next();
			if(count.containsKey(s)){
				int v = count.get(s);
				count.put(s, v + 1);
			}else{
				count.put(s, 1);
			}
		}
		int max = 0;
		for(String k : count.keySet()){
			int v = count.get(k);
			max = Math.max(max, v);
		}
		List<String> lst = new ArrayList<String>();
		for(String k : count.keySet()){
			int v = count.get(k);
			if(v == max){
				lst.add(k);
			}
		}
		Collections.sort(lst);
		for(String s : lst){
			System.out.println(s);
		}

	}
}
