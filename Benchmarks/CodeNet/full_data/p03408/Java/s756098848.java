import java.util.*;
// warm-up
// Test case test case.. Look its voldemort.. And he gets a red card.. He has no nose isnt it..
public class Main {

	static class Element implements Comparable<Element> {
		String e = null; int c = 0;
		Element (String a, int ct) {
			a=e; c=ct;
		}
		public int compareTo (Element other) {
			return other.c-c;
		}
	}

	static void solve() {
		Scanner sc = new Scanner(System.in);
		Map<String, Integer> m = new HashMap<String, Integer>();
		List<Element> l = new ArrayList<Element>();
		int N = sc.nextInt();
		while (N-->0) {
			String a = sc.next();
			m.put(a, m.get(a)==null ? 1 : m.get(a)+1);
		}
		N = sc.nextInt();
		while (N-->0) {
			String a = sc.next();
			m.put(a, m.get(a)==null ? -1 : m.get(a)-1);
		}
		for (String a : m.keySet()) l.add(new Element(a, m.get(a)));
		Collections.sort(l);
		System.out.println(l.get(0).c<0 ? 0 : l.get(0).c);
		sc.close();		
	}

	public static void main(String args[]) {
		solve();
	}

}