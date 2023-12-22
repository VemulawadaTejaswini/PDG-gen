import java.util.*;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}


	public void run() {
		Scanner sc = new Scanner(System.in);
		TreeMap<Long,Long> m = new TreeMap<>();
		int N=sc.nextInt();
		for(int i=0; i<N; i++) {
			long a = sc.nextLong();
			long b = sc.nextLong();
			m.put(b, m.containsKey(b) ? m.get(b)+a : a);
		}
		long sub = 0;
		for(Map.Entry<Long, Long> e : m.entrySet()) {
			long b = e.getKey();
			long a = e.getValue();
			if(b-sub<a) {
				System.out.println("No");
				sc.close();
				return;
			}
			sub += a;
		}
		System.out.println("Yes");
		sc.close();
	}
}
