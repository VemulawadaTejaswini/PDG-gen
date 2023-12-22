import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	static Scanner sc;

	public static void main(String[] args) throws Exception {
		InputStream in = System.in;

		sc = new Scanner(in);

		int N = sc.nextInt();
		int K = sc.nextInt();
		//long[] A = new long[N];
		TreeMap<Integer, Integer> m = new TreeMap<Integer, Integer>();

		int answer = 0;
		boolean run = true;

		for(int i = 0; i < N; i++){
			//A[i] = sc.nextLong();
			int a = sc.nextInt();
			if(m.get(a) == null){
				m.put(a, 0);
			}
			m.put(a, m.get(a)+1);
		}

		ArrayList<Integer> l = new ArrayList<>();
		for(int v : m.values()){
			l.add(v);
		}
		Collections.sort(l);

		for(int i = 0; i < m.size() - K; i++){
			answer += l.get(i);
		}

		System.out.println(answer);
	}
}