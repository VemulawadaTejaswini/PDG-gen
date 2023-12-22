


import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;



public class Main {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int size = 1<<n;

		TreeMap<Integer, int[]> s = new TreeMap<>();

		for (int i=0;i<size;i++) {
			int x = sc.nextInt();
			if (!s.containsKey(x)) {
				s.put(x, new int[1]);
			}
			s.get(x)[0]++;
		}
		System.out.println(isPossible(s) ? "Yes" : "No");


	}

	static boolean isPossible (TreeMap<Integer, int[]> s) {
		TreeMap<Integer, int[]> t = new TreeMap<>();
		t.put(s.lastKey(), new int[]{1});
		s.get(s.lastKey())[0]--;
		if (s.get(s.lastKey())[0]==0) {
			s.remove(s.lastKey());
		}
		
		while (true) {
		
			TreeMap<Integer, int[]> u = new TreeMap<>();
			for (Map.Entry<Integer, int[]> v : t.entrySet()) {
				int size = v.getKey();
				int num = v.getValue()[0];

				for (int i=0;i<num;i++) {

					if (s.lowerKey(size)==null) {
						return s.isEmpty();
					}
					int target = s.lowerKey(size);
					s.get(target)[0]--;
					if (s.get(target)[0]==0) {
						s.remove(target);
					}
					if (!u.containsKey(target)) {
						u.put(target, new int[1]);
					}
					u.get(target)[0]++;
				}
			}

			for (Map.Entry<Integer, int[]> v : u.entrySet()) {
				int size = v.getKey();
				int num = v.getValue()[0];
				for (int i=0;i<num;i++) {

					if (!t.containsKey(size)) {
						t.put(size, new int[1]);
					}
					t.get(size)[0]++;
				}
			}

		}

	}




}





