
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	Scanner scan = new Scanner(System.in);
	
	void compute() {
		int n = scan.nextInt();
		
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Integer> sorted = new ArrayList<>();
		for (int i=0;i<n;i++) {
			int buf = scan.nextInt();
			list.add(buf);
			sorted.add(buf);
		}
		
		Collections.sort(sorted);
		Collections.reverse(sorted);
		
		for (int i=0;i<n;i++) {
			System.out.println(list.get(i) != sorted.get(0) ? sorted.get(0) : sorted.get(1));
		}
	}
	
	
	public static void main(String...arg) {
		new Main().compute();
	}
}
