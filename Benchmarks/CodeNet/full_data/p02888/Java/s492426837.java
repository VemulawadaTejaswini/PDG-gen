import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) list.add(sc.nextInt());
		Collections.sort(list);
		TreeMap<Integer, Integer> l = new TreeMap<>();

		for (int i = 0; i < n; i++) {
			l.put(list.get(i), i);
		}
		int sum = 0;

		for (int i = l.lastKey(); i != l.firstKey(); i = l.lowerKey(i)) {
			for (int j = l.floorKey(i); j != l.firstKey() ; j = l.lowerKey(j)) {
				//System.out.println(l.get(i) +" " +l.get(j));
				if (l.get(i) == l.get(j) && l.get(i) == (l.get(l.lowerKey(i))+1)) continue;
				//System.out.println(l.get(i) + " " + l.get(l.lowerKey(i)));
					int f =  l.higherKey(i - j);
					if (j > f) {
						//System.out.println(i + " " + j +" "+ l.higherKey(i - j) + " " +l.get(j)+" " + l.get(f));
						sum += l.get(j) - l.get(f);
					}
				
			}
		}


		System.out.println(sum);



	}
}
