
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	Scanner scan = new Scanner(System.in);
	Comparator<Integer> comp = new LowerBoundComparator<>();
	
	void compute() {
		int n = scan.nextInt();
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for (int i=0;i<n;i++) {
			int num = scan.nextInt();
			boolean did = false;
			int p = Collections.binarySearch(list, num, comp);
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
	
	class LowerBoundComparator<T extends Comparable<? super T>> implements Comparator<T> {
	    public int compare(T x, T y) {
	        return (x.compareTo(y) >= 0) ? 1 : -1;
	    }
	}
	
	
	public static void main(String...arg) {
		new Main().compute();
	}
}
