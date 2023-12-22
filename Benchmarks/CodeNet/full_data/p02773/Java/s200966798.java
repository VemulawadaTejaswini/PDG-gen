import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		String[] S = new String[N];
		for (int i = 0; i < N; i++)
			S[i] = scanner.next();

		ArrayList<String> listString = new ArrayList<String>();	
		ArrayList<Integer> listNum = new ArrayList<Integer>();	

		for (int i = 0; i < N; i++) {
			int index = listString.indexOf(S[i]);
			if (index == -1) {
				listString.add(S[i]);
				listNum.add(1);
			}
			else {
				listNum.set(index, listNum.get(index) + 1);
			}
		}

		int max = 0;
		for (int i = 0; i < listString.size(); i++) {
			if (max < listNum.get(i))
				max = listNum.get(i);
		}

		ArrayList<String> listSortedString = new ArrayList<String>();
		for (int i = 0; i < listString.size(); i++) {
			if (listNum.get(i) == max)
				listSortedString.add(listString.get(i));
		}

		Collections.sort(listSortedString);

		for (int i = 0; i < listSortedString.size(); i++)
			System.out.println(listSortedString.get(i));
	}
}