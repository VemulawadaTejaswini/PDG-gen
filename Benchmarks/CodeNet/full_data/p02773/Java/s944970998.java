import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[] list = new String[N];
		System.out.println();
		System.out.println();
		for(int i = 0; i < N; i++) {
			list[i]= sc.next();
		}
//		Map<String, Integer> m = new HashMap<String, Integer>();
//		// Java7以降なら new HashMap<>() でOK
//
//		Object a;
//		for (String s : a) {
//		    int v;
//		    if (m.containsKey(s)) {
//		        // Mapに登録済み
//		        v = m.get(s) + 1;
//		    } else {
//		        // Mapに未登録
//		        v = 1;
//		    }
//		    m.put(s, v);
//		}
	}
}
