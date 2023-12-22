import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int L = scanner.nextInt();
		String[] S = new String[N];
		Map<Integer, String> map = new TreeMap<Integer,String>();
		for(int i=0;i<N;i++) {
			S[i] = scanner.next();
			map.put((int)S[i].charAt(0), S[i]);
		}
		L=L+1;
		for(String s:map.values()) {
			System.out.print(s);
		}
		System.out.println();
		scanner.close();
	}

}
