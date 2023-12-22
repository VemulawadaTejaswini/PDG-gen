import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int P[] = new int[M];
		int Y[] = new int[M];
		for(int i = 0; i < M; i++) {
			P[i] = sc.nextInt();
			Y[i] = sc.nextInt();
		}
		
		ArrayList<Integer> list[] = new ArrayList[M];
		for(int i = 0; i < M; i++) {
			list[i] = new ArrayList<Integer>();
		}
		
		for(int i = 0; i < M; i++) {
			list[P[i]].add(Y[i]);
		}
		
		for(int i = 0; i < M; i++) {
			Collections.sort(list[i]);
		}
		
		for(int i = 0; i < M; i++) {
			int num = list[P[i]].indexOf(Y[i]);
			System.out.println(String.format("%06d", P[i]) + String.format("%06d", num + 1));
		}
	}

}
