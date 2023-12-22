import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Set<Integer> A = new TreeSet<>();
		Set<Integer> B = new TreeSet<>();
		Set<Integer> C = new TreeSet<>();

		for(int i=0;i<N;i++) {
			A.add(sc.nextInt());
		}
		List<Integer> a = new ArrayList<>(A);

		for(int i=0;i<N;i++) {
			B.add(sc.nextInt());
		}
		List<Integer> b = new ArrayList<>(B);

		for(int i=0;i<N;i++) {
			C.add(sc.nextInt());
		}
		List<Integer> c = new ArrayList<>(C);

		Set<String> ans = new HashSet<>();
		for(int i=0;i<a.size();i++) {
			for(int j=0;j<b.size();j++) {
				if(a.get(i) >= b.get(j)) continue;
				for(int k=0;k<c.size();k++) {
					if(b.get(j) >= c.get(k)) continue;
					String s = String.valueOf(a.get(i)) +" "+ String.valueOf(b.get(j)) +" "+ String.valueOf(c.get(k));
					System.out.println(s);
					ans.add(s);
				}
			}
		}

		System.out.println(ans.size());
	}
}