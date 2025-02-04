import java.util.*;

public class Main {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long k = sc.nextLong();

		Map<Integer, Long> mp = new HashMap<Integer, Long> ();
		ArrayList<Integer> al = new ArrayList<Integer> ();
		while(sc.hasNextLine()) {
			int a = sc.nextInt();
			long t = sc.nextLong();
			if(mp.containsKey(a)) {
				mp.put(a, mp.get(a)+t);
			}
			else {
				mp.put(a, t);
				al.add(a);
			}
		}
		
		Integer[] ar = al.toArray(new Integer[al.size()]);
		Arrays.sort(ar);
		int i = 0;
		long ttl = mp.get(ar[i]);
		while(ttl<k) {
			i++;
			ttl += mp.get(ar[i]);
		}
		System.out.println(ar[i]);
	}
}