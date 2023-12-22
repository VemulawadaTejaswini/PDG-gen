import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}



	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		Set<Long> m = new HashSet<Long>();
		long cnt=0;
		for(int i=0; i<n; i++) {
			long v=sc.nextLong();
			if(m.contains(v)) {
				m.remove(v);
				cnt--;
			} else {
				m.add(v);
				cnt++;
			}
		}
		System.out.println(cnt);
		sc.close();
	}

}
