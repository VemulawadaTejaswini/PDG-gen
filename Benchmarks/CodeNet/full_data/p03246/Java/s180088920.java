
import java.util.*;
public class Main {
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		HashMap<Integer, Integer> Even = new HashMap<Integer,Integer>();
		HashMap<Integer, Integer> Odd = new HashMap<Integer,Integer>();
		
		for (int i = 0; i < N; i++) {
			HashMap <Integer, Integer> map;
			if (i % 2 == 0) map = Even;
			else map = Odd;
			
			int c = sc.nextInt();
			if (map.containsKey(c)) 
				map.put(c, map.get(c) + 1);
			else
				map.put(c, 1);
		}
		
		ArrayList<int[]> ev = new ArrayList<int[]>(); ev.add(new int[] {-1, 0});
		ArrayList<int[]> od = new ArrayList<int[]>(); od.add(new int[] {-1, 0});
		for (int key: Even.keySet()) 
			ev.add(new int [] {key, Even.get(key)});
		for (int key: Odd.keySet()) 
			od.add(new int [] {key, Odd.get(key)});
		
		ev.sort(new Comparator<int[]>() {
			public int compare (int [] o1, int [] o2) 
				{return o2[1] - o1[1];}
		});
		od.sort(new Comparator<int[]>() {
			public int compare (int [] o1, int [] o2) 
				{return o2[1] - o1[1];}
		});
		
		int m1 = 0, m2 = 0;
		while (ev.get(m1)[0] == od.get(m2)[0]) {
			if (ev.get(m1)[1] - ev.get(m1 + 1)[1] >= od.get(m2)[1] - od.get(m2 + 1)[1]) 
				m2++;
			else
				m1++;
		}
		System.out.println(N - (ev.get(m1)[1] + od.get(m2)[1]));
	}
}
