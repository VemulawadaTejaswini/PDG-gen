import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		List<Integer> A = new ArrayList<>();
		for(int i = 0; i < N; i++) {
			int a = sc.nextInt();
			if(A.contains(a))
				A.remove(A.indexOf(a));
			else
				A.add(a);
		}
		System.out.println(A.size());
	}

}