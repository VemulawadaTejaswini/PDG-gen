import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), K = sc.nextInt();
		long[] line = new long[N];
		
		for(int i = 0; i < N; i++) {
			line[i] = sc.nextLong();
		}
		
		ArrayList<Long> list = map(N,line);
		System.out.println(list.get(K-1));
	}
	
	public static ArrayList<Long> map(int N, long[] line) {
		ArrayList<Long> list = new ArrayList<>();
		Map<Integer,Long> linem = new HashMap<>();
		for(int i = 0; i < N; i++) {
			linem.put(i, line[i]);
		}
		for(int i = 0; i < N; i++) {
			for(int j = i + 1; j < N; j++) {
				list.add((linem.get(i))*(linem.get(j)));
			}
		}
		Collections.sort(list);
		return list;
	}
}