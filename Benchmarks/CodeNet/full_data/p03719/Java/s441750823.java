import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int K = scn.nextInt();
		Pair[] P = new Pair[N];
		for(int i = 0;i < N;i++) {
			P[i] = new Pair(scn.nextInt(),scn.nextInt());
		}
		Arrays.sort(P);
		int ans=0;
		for(int i = 0;i < N;i++) {
			K-=P[i].getB();
			if(K<=0)ans = P[i].getA();
		}
		System.out.println(ans);
	}

}

class Pair implements Comparable<Pair>{
	int a;
	int b;

	Pair(int a, int b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public int compareTo(Pair o) {
		if(this.getA() > o.getA())return 1;
		if(this.getA() < o.getA())return -1;
		return 0;
	}


	int getA() {
		return this.a;
	}

	int getB() {
		return this.b;
	}
}
