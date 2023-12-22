import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		// TODO 自動生成されたメソッド・スタブ

		 Scanner sc1 = new Scanner(System.in);
			int n =Integer.parseInt(sc1.next());
			int now;
			int total;
			int a;
			ArrayList<Integer> ar1 = new ArrayList<Integer>();

			for (int i = 0 ; i < n ; i++) {
				ar1.add(Integer.parseInt(sc1.next()));
			}

			for (int j = 0 ; j < n ; j++) {
				now = 0;
				total = 0;
				a = 0;
				for (int k = 0 ; k < n ; k++) {
					a = ar1.get(k);
					if ( k == j) {
						continue;
					}
					else {
						total += Math.abs(now - a);
						now = a;
					}
				}
				total += Math.abs(now - 0);
				System.out.println(total);
			}

			sc1.close();

	}
}
