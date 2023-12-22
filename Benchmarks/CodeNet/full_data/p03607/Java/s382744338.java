
import java.util.*;
import java.util.stream.*;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}


	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		Set<Integer> s = new HashSet<Integer>();
		for(int i=0; i<n; i++) {
			int v=sc.nextInt();
			if(s.contains(v)) {
				s.remove(v);
			}else {
				s.add(v);
			}
		}
		System.out.println(s.size());
		sc.close();
	}
}
