
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	Scanner scan = new Scanner(System.in);
	
	void compute() {
		int n = scan.nextInt();
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for (int i=0;i<n;i++) {
			int num = scan.nextInt();
			boolean did = false;
			int p = Collections.binarySearch(list, num);
			if (p < 0)
				p = ~p;
			if (p == 0) {
				list.add(0, num);
			} else {
				list.set(p-1, num);
			}
		}
		
		System.out.println(list.size());
	}
	
	
	public static void main(String...arg) {
		new Main().compute();
	}
}
