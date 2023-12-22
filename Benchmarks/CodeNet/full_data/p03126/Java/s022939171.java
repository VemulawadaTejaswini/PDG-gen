import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int M = Integer.parseInt(sc.next());

		Map<Integer, ArrayList<Integer>> map = new TreeMap<Integer, ArrayList<Integer>>();
		for(int i = 0; i < N; i++) {
			int K = Integer.parseInt(sc.next());
			ArrayList<Integer> list = new ArrayList<>();
			for(int j = 0; j < K; j++) {
				list.add(Integer.parseInt(sc.next()));
			}
			map.put(i + 1, list);
		}
		sc.close();
		
		int count = 0;
		for(int i = 1; i <= M; i++) {
			boolean check = true;
			for(int j = 0; j < N; j++) {
				if(map.get(j + 1).contains(i)) {
					continue;
				}else {
					check = false;
					break;
				}
			}
			if(check) count++;
		}
		System.out.println(count);
	}
}