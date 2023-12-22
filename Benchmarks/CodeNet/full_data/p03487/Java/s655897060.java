
import java.util.*;
import java.util.Map.*;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}


	public void run() {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		Map<Integer, Integer> m = new HashMap<Integer, Integer>();
		for(int i=0; i<N; i++) {
			int a=sc.nextInt();
			m.put(a, m.containsKey(a) ? m.get(a)+1 : 1);
		}
		long sum = 0;
		for(Entry<Integer,Integer> e : m.entrySet()) {
			int a = e.getKey();
			int cnt = e.getValue();

			if(a<cnt) {
				sum += cnt-a;
			}else if(a>cnt){
				sum += cnt;
			}
		}
		System.out.println(sum);
		sc.close();
	}
}
