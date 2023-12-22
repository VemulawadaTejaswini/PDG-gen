import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int a[] = new int[100];
		LinkedList<Integer> sorted = new LinkedList<Integer>();

		int total = 0;
		for (int i=0; i<n; i++) {
			a[i] = sc.nextInt();
			total += a[i];
			int idx = 0;
			while(true) {
				if (i == idx) {
					sorted.add(idx, a[i]);
					break;
				}
				if (sorted.get(idx) < a[i]) {
					sorted.add(idx, a[i]);
					break;
				}
				idx++;
			}
//			System.out.printf("%d %d %d\n", a[0],a[1],a[2]);
//			if(i>2) {
//			System.out.printf("%d %d %d\n", sorted.get(0),sorted.get(1),sorted.get(2));
//			}
		}


//		String s = sc.next();
		String res = "";

		if(sorted.get(m) >= total / (4 * m)) {
			res = "yes";
		} else {
			res = "no";
		}
//		System.out.printf("%d %d %d\n", a[0],a[1],a[2]);
//		System.out.printf("%d %d %d\n", sorted.get(0),sorted.get(1),sorted.get(2));
		System.out.println(res);
	}


}
