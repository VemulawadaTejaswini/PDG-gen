import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0; i < N; i++) {
			list.add(Integer.parseInt(sc.next()));
		}
		sc.close();

		//降順にリストをソート
		Collections.sort(list, Collections.reverseOrder());

		//判定
		int max = list.get(0);
		int sum = 0;
		for(int i = 1; i < list.size(); i++) {
			sum += list.get(i);
		}
		if(max < sum) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}