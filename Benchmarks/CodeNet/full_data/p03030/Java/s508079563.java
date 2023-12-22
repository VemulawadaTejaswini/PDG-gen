
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n    = Integer.parseInt(scanner.nextLine());
		List<Restaurant> list = new ArrayList<Restaurant>();

		for(int i = 1; i <= n; i++) {

			String name = scanner.next();
			int score   = scanner.nextInt();
			list.add(new Restaurant(name, score, i));

		}


        Collections.sort(list);
        for(Restaurant res: list){
        	System.out.println(res.num);
        }

	}

	public static class Restaurant implements Comparable<Restaurant>{

		String machi;
		int score;
		int num;

		public Restaurant(String machi, int score, int num) {

			this.machi = machi;
			this.score = score;
			this.num   = num;
		}

		public int compareTo(Restaurant other) {

			int ans = this.machi.compareTo(other.machi);
			if(ans != 0) return ans;

			return Integer.compare(other.score,this.score);

		}
	}
}