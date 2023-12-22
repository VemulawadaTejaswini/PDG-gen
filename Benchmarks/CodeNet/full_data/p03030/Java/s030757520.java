import java.util.*;
import static java.lang.System.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] name = new String[n];
		int[] score = new int[n];
		ArrayList<String> list = new ArrayList<>();
		ArrayList<Integer> show = new ArrayList<>();
		
		for(int i =0; i < n; i++) {
			name[i] = sc.next();
			score[i] = sc.nextInt();
			if (! list.contains(name[i]))
				list.add(name[i]);
		}
		Collections.sort(list);
		int cnt = 1;
		
		for(int i = 0; i < list.size(); i++) {
			String store = list.get(i);
			for(int j = 100; j > 0; j--) {
				int num = j;
				for(int k = 0; k < n; k++) {
					if ( name[k].equals(store) && score[k] == num) {
						show.add(k + 1);
						cnt++;
					}
				}			
			}
		}
		for(int m: show)
			out.println(m);
	}
}