import java.util.*;

public class Main {
    public static void main(String []args) throws Exception {
    	Main o = new Main();
        o.run();
    }

	void run() throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int []alist = new int[n];
		for (int i = 0; i < n; i++) {
			alist[i] = sc.nextInt();
		}
		LinkedList<Integer> bList = new LinkedList<Integer>();
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				bList.add(alist[i]);
			} else {
				bList.addFirst(alist[i]);
			}
		}
		if (n %2 == 1) {
			Collections.reverse(bList);
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			if (i != 0) {
				sb.append(' ');
			}
			sb.append(bList.get(i));
		}
		System.out.println(sb);
	}
}
