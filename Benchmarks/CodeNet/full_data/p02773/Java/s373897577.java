

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();

		HashMap<String, Integer> vote = new HashMap<>();
		String temp;
		for (int i = 0; i < N; i++) {
			temp = scan.next();

			if (vote.containsKey(temp)) {
				vote.put(temp, vote.get(temp) + 1);
			} else {
				vote.put(temp, 1);
			}
		}

		int max = Collections.max(vote.values());

		ArrayList<String> anser = new ArrayList<String>();
		for (Map.Entry<String, Integer> map : vote.entrySet()) {
			if (map.getValue() == max) {
				anser.add(map.getKey());
			}
		}

		Collections.sort(anser);

		for (String s : anser) {
			System.out.println(s);
		}

	}

}
