import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		ArrayList<Integer> list = new ArrayList<>();
		boolean[] check = new boolean[N - 1];

		//初項を投入
		list.add(Integer.parseInt(sc.next()));
		for(int i = 1; i < N; i++) {
			list.add(Integer.parseInt(sc.next()));
			if(list.get(i - 1) >= list.get(i)) {
				check[i - 1] = true;
			}else {
				check[i - 1] = false;
			}
		}
		sc.close();

		//checkの配列を見ていく
		int count = 0;
		int checkCount = 0;
		for(int i = 0; i < check.length; i++) {
			if(check[i] == true) {
				checkCount++;
				count = Math.max(checkCount, count);
			}else {
				checkCount = 0;
			}
		}
		System.out.println(count);
	}

}