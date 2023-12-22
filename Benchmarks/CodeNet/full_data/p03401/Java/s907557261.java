import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < N; i++) {
			list.add(i, sc.nextInt());
		}

		for (int i = 0; i < N; i++) {
			int cnt = 0;
			int x = list.get(i);
			list.remove(i);
			cnt += Math.abs(list.get(0));
			for(int j = 0; j < (N - 2); j++) {
				cnt += Math.abs(list.get(j) - list.get(j + 1));
			}
			cnt += Math.abs(list.get(N - 2));
			System.out.println(cnt);
			list.add(i, x);
		}
		
		sc.close();

	}

}