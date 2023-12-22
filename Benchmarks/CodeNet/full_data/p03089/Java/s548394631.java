import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int n = 0;
	static List<Integer> b = null;
	
	public static void main(String[] args) {
		n = sc.nextInt();
		b = new ArrayList<>();
		for(int i = 0; i < n; ++i) b.add(sc.nextInt());
		
		List<Integer> trace = findTrace();
		if(trace == null) {
			System.out.println(-1);
			return;
		}
		
		for(int i = trace.size() - 1; i >= 0; --i) {
			System.out.println(trace.get(i));
		}
	}
	
	static List<Integer> findTrace() {
		List<Integer> res = new ArrayList<>();
		while(b.size() > 0) {
			for(int i = b.size() - 1; i >= 0; --i) {
				if(b.get(i) - 1 == i) {
					res.add(b.get(i));
					b.remove(i);
					break;
				}
				if(i == 0) return null;
			}
		}
		return res;
	}
}