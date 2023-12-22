import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		Map<Integer, Integer> school = new HashMap<Integer, Integer>();
		for(int i = 1; i <= N; i++) {
			school.put(Integer.parseInt(sc.next()), i);
		}
		sc.close();

		for(int i = 1; i <= N; i++) {
			int tmp = school.get(i);
			if(i != N) {
				System.out.print(tmp + " ");
			}else {
				System.out.println(tmp);
			}
		}

	}

}