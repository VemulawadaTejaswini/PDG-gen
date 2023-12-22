import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Main{

	public static void main(String[] args)throws Exception {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			 PrintWriter out = new PrintWriter(System.out);

			int n = Integer.parseInt(br.readLine());

			Map<String,Integer> map = new HashMap<>();
			int max = 0,tmp = 0;
			for(int i = 0; i < n; i++) {
				String s =  br.readLine();

				if(map.containsKey(s)) {
					tmp = map.get(s)+1;
					map.put(s,tmp);
					max = Math.max(tmp, max);
				}else {
					map.put(s,1);
					max = Math.max(max, 1);
				}


			}

			List<String> list = new ArrayList<>();
			for(String key: map.keySet()) {
				if(map.get(key)==max) {
					list.add(key);
				}
			}

			Collections.sort(list);

			for(String a: list) {
				out.println(a);
			}
			out.flush();

		}


	}

}
