import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] v = new int[n];
		for(int i = 0;i < n;i++) {
			v[i] = sc.nextInt();
		}
		sc.close();
		Map<Integer,Integer> Odds = new HashMap<>();
		Map<Integer, Integer> Evens = new HashMap<>();
		Odds.put(0, 0);
		Evens.put(0, 0);
		for(int i = 0;i < n;i++) {
			if((i+1)%2!=0) {
				if(Odds.containsKey(v[i])) {
					Odds.put(v[i], Odds.get(v[i])+1);
				}else {
					Odds.put(v[i], 1);
				}
			}else {
				if(Evens.containsKey(v[i])) {
					Evens.put(v[i], Evens.get(v[i])+1);
				}else {
					Evens.put(v[i], 1);
				}
			}
		}

		Comparator<Entry<Integer,Integer>> comp = Entry.comparingByValue();
		Entry<Integer,Integer> O1 =Odds.entrySet().stream()
				.max(comp)
				.get();
		Entry<Integer,Integer> E1 =Evens.entrySet().stream()
				.max(comp)
				.get();
		Odds.remove(O1.getKey());
		Evens.remove(E1.getKey());
		Entry<Integer,Integer> O2 =Odds.entrySet().stream()
				.max(comp)
				.get();
		Entry<Integer,Integer> E2 =Evens.entrySet().stream()
				.max(comp)
				.get();
		n -= O1.getKey().equals(E1.getKey())
				? Math.max(O1.getValue()+E2.getValue(),
						E1.getValue()+O2.getValue())
						: O1.getValue()+E1.getValue();
		System.out.println(n);
	}
}