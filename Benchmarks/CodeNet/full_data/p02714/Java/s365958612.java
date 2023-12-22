import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		long sum = 0;
		List<Integer> rset = new ArrayList<>();
		List<Integer> gset = new ArrayList<>();
		List<Integer> bset = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			if (s.charAt(i) == 'R') {
				rset.add(i);
			} else if (s.charAt(i) == 'G') {
				gset.add(i);
			} else if (s.charAt(i) == 'B') {
				bset.add(i);
			}
		}
		sum = rset.size() * gset.size() * bset.size();
		for (int i = 0; i < rset.size(); i++) {
			for (int j = 0; j < gset.size(); j++) {
				int a = rset.get(i);
				int b = gset.get(j);
				int max = Math.max(b,a);
				int min = Math.min(b,a);
				if (bset.contains(Math.abs(b-a) + max)) {
					sum--;
				}
				if ((a+b) %2 ==0 && bset.contains((a+b)/2)) {
					sum--;
				}
				if (bset.contains(min - Math.abs(b-a))) {
					sum--;
				}
			}
		}
		System.out.println(sum);
	}

}
