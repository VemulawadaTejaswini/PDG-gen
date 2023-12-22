import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//Input
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());

		ArrayList<restaurant> list = new ArrayList<>();

		for(int i = 0; i < N; i++) {
			String city = sc.next();
			int score = Integer.parseInt(sc.next());
			restaurant r = new restaurant(i+1, city, score);
			list.add(r);
		}

		sc.close();

		Collections.sort(list, new myComp());

		for(restaurant r : list) {
			System.out.println(r.no);
		}

	}


}

class restaurant {
	int no;
	String city;
	int score;

	restaurant(int no, String city, int score){
		this.no = no;
		this.city = city;
		this.score = score;
	}
}

class myComp implements Comparator<restaurant>{

	@Override
	public int compare(restaurant r1, restaurant r2) {
		if(r1.city.compareTo(r2.city) > 0) {
			return 1;
		}else if(r1.city.compareTo(r2.city) < 0) {
			return -1;
		}else {
			if(r1.score < r2.score) {
				return 1;
			}else {
				return -1;
			}
		}
	}

}
