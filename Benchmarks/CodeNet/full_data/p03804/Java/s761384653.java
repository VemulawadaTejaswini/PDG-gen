
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		String[] n_array = new String[n];
		for(int i = 0; i < n; i++) {
			n_array[i] = sc.next();
		}

		String[] m_array = new String[m];
		for(int i = 0; i < m; i++) {
			m_array[i] = sc.next();
		}

		String check = m_array[0];

		for(int i = 0; i < n - m + 1; i++) { //mの1行目が入る可能性のあるnの行
			List<Integer> indexlist = new ArrayList<>();
			int index = 0;

			while(n_array[i].indexOf(check, index) != -1) {
				index = n_array[i].indexOf(check, index);
				indexlist.add(index);
				index++;
			}

			if(indexlist.size() > 0) {
				for(int ind : indexlist) {
					for(int j = 1; j < m; j++) {
						if(!n_array[i + j].substring(ind, ind + m).equals(m_array[j])) {
							break;
						}
						
					}
					System.out.println("Yes");
					return;
				}
			}
			System.out.println("No");
		}

	}
}
