import java.util.*;

public class Main{
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[][] store = new String[N][3];

		for(int i = 0; i < N; i++) {
			store[i][0] = String.valueOf(i + 1);
			store[i][1] = sc.next();
			store[i][2] = sc.next();
		}

		Arrays.sort(store, new Comparator<String[]>(){
			@Override
			public int compare(String[] s1, String[] s2) {
				if(!s1[1].equals(s2[1])) {
					return (s1[1].compareTo(s2[1]));
				}
				else {
					return (Integer.compare(Integer.parseInt(s2[2]), Integer.parseInt(s1[2])));
				}
			}
		});
		for(int i = 0; i < N; i++) {
			System.out.println(store[i][0]);
		}
	}
}