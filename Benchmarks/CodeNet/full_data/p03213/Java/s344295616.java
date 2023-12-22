import static java.lang.Integer.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {
	public static TreeMap<Integer,Integer> divMap = new TreeMap<>();
	public static List<Integer> divList = new ArrayList<>();
	public static int count;
	public static List<List<Integer>> divAllList = new ArrayList<>();
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int N = parseInt(st.nextToken());

		fact(N);
		search75();


		System.out.println(count);


	}

	private static void search75() {
		List<Integer> li= new ArrayList<>();
		search75plus(divMap,1);

	}

	private static void search75plus(TreeMap<Integer,Integer> map,int pSum) {
		if(map.firstEntry() == null) {
			return;
		}
		Map.Entry<Integer,Integer> me = map.firstEntry();
		map.remove(me.getKey());
		int ki=me.getValue();
		for(int k=0;k<=ki;k++) {

			int sum = (k+1)*pSum;

			if(sum <75) {
				TreeMap<Integer, Integer> map2 = new TreeMap<Integer, Integer>(map);
				search75plus(map2,sum);
			}else if(sum == 75) {
				count ++;
				break;
			}else {
				break;
			}
		}

	}


	private static void fact(int ii) {
		for(int i=2;i<=ii;i++) {
			makePrimeMap(i);
		}

	}

	private static void makePrimeMap(int num) {
		for (int i = 2;i<=num;i++) {

			if (num % i == 0) {

				if(!divMap.containsKey(i)) {
					divMap.put(i, 1);
				}else {
					int t = divMap.get(i);
					divMap.put(i, t+1);
				}

				num /= i;

				i = 1;
			}
		}

	}


}