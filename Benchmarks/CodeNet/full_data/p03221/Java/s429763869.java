import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int []P = new int[M];
		int []Y = new int[M];
		for(int i = 0; i < M; i++) {
			P[i] = sc.nextInt();
			Y[i] = sc.nextInt();
		}
		sc.close();

		Data []d = new Data[M];
		for(int i = 0; i < M; i++) {
			d[i] = new Data(i + 1, Y[i], P[i]);
		}
		Map<Integer, List<Data>> map = new HashMap<Integer, List<Data>>();
		for(int i = 0; i < M; i++) {
			if(map.containsKey(d[i].p)) {
				map.get(d[i].p).add(d[i]);
			}else {
				List<Data> list = new ArrayList<Data>();
				list.add(d[i]);
				map.put(d[i].p, list);
			}
		}
		for(int key : map.keySet()) {
			List<Data> list = map.get(key);
			Collections.sort(list, new MyComparator());
			int cnt = 1;
			for(Data t : list) {
				String s1 = String.format("%06d", t.p);
				String s2 = String.format("%06d", cnt);
				cnt++;
				t.n = s1 + s2;
			}
		}
		for(Data t : d) {
			System.out.println(t.n);
		}
	}
	static class Data{
		int id, y, p;
		String n;
		public Data(int id, int y, int p) {
			this.id = id;
			this.y = y;
			this.p = p;
		}
	}
	 static class MyComparator implements Comparator<Data>{
		 @Override
        public int compare(Data d1, Data d2) {
			 if(d1.y > d2.y) {
				 return 1;
			 }else if(d1.y < d2.y) {
				 return -1;
			 }else {
				 return 0;
			 }
		 }
	 }

}