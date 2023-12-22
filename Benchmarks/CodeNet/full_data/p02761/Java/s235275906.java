import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int m = scan.nextInt();
		boolean check = false;
		int num = 0;

		ArrayList<HashSet<Integer>> list = new ArrayList<HashSet<Integer>>(n);

		for(int i = 0;i < n;i++) {
			list.add(new HashSet<Integer>());
		}

		for(int i = 0;i < m;i++) {
			list.get(scan.nextInt() - 1).add(scan.nextInt());
		}

		for(int i = 0;i < n;i++) {
			if(list.get(0).contains(0) || list.get(0).isEmpty()) {
				check = true;
				break;
			}
			if(list.get(i).size() > 1) {
				check = true;
				break;
			}
		}

		if(check) {
			System.out.println(-1);
		}else {
			for(int i = 0;i < n ;i++) {
				if(list.get(i).isEmpty()) {

				}else {
					for (int a : list.get(i)) {
						num += a * Math.pow(10, n - 1 - i);
					}
				}
			}
			System.out.println(num);
		}
	}
}