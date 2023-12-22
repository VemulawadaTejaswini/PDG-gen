
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int k=sc.nextInt();
		ArrayList<Long> a = new ArrayList<Long>();
		for(long i=1; i<=9; i++) a.add(i);
		while(true) {
			if(k <= a.size()) {
				System.out.println(a.get(k-1));
				break;
			}
			k -= a.size();
			ArrayList<Long>old = new ArrayList<Long>(a);
			a.clear();
			for(long i : old) {
				for(int j=-1; j<=1; j++) {
					long d = i%10+j;
					if(d<0 || d>9) continue;
					a.add(i*10+d);
				}
			}
		}
		sc.close();
	}

}
