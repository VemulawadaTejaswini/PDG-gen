import java.util.Arrays;
import java.util.Scanner;

class Pair implements Comparable<Pair>{
	int A, B;
	public Pair(int _A, int _B) {
		A = _A;
		B = _B;
	}
	public int compareTo(Pair o) {
		return A - o.A;
	}

}

public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int N = sc.nextInt(), M = sc.nextInt();
		Pair[] energy = new Pair[N];
		for(int i = 0; i < N; i++) {
			energy[i] = new Pair(sc.nextInt(), sc.nextInt());
		}
		Arrays.sort(energy);
		long cost = 0;
		for(int i = 0; i < N; i++) {
			if(M == 0) break;
			int buy = Math.min(energy[i].B, M);
			M -= buy;
			cost += (long)buy * (long)energy[i].A;
		}
		System.out.println(cost);
	}
}
