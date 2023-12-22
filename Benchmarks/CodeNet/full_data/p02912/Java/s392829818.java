

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] tmpArray = br.readLine().split(" ");
		int n = Integer.parseInt(tmpArray[0]);
		int m = Integer.parseInt(tmpArray[1]);

		tmpArray = br.readLine().split(" ");

		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(new Comparator<Integer>() {

			@Override
			public int compare(Integer i1, Integer i2) {
				// TODO 自動生成されたメソッド・スタブ
				return i2 - i1;
			}
		});

		for(int i = 0; i < n; i++){
			int tmp = Integer.parseInt(tmpArray[i]);
			pq.add(tmp);
		}
		for(int i = 0; i < m; i++){
			int tmp = pq.remove();
			tmp /= 2;
			pq.add(tmp);
		}

		long result = 0;
		for(int i = 0; i < n; i++){
			int tmp = pq.remove();
			result += tmp;
		}

		System.out.println(result);

	}

}
