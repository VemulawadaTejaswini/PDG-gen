
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Map m = new HashMap<String,Integer>();
		for(int i = 0 ; i < n ; i++) {
			String s = br.readLine();
			if(m.containsKey(s)) {
				m.put(s,(int) m.get(s)+1);	
			}else {
				m.put(s, 1);
			}
		}
		int max =getMax(m);
		ArrayList<String> keylist = new ArrayList<String>();
		for(Object key : m.keySet()) {
			if(max == (int) m.get(key)) {
				keylist.add((String) key);
			}	
		}
		Collections.sort(keylist);
		for(String str : keylist) {
			System.out.println(str);
		}
		
	}
 	public static int getMax(Map<String ,Integer> m ) {
		int res = 0;
		for(Object key : m.keySet()) {
			res = Math.max(res, m.get(key));
		}
		return res;
	}

}
