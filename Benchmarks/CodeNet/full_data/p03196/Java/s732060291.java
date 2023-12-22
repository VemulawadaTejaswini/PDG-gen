import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		long N = scn.nextLong();
		long P = scn.nextLong();
		ArrayList<Pair> A = new ArrayList<Pair>();
		for(int i = 2;i <= Math.sqrt(P);i++) {
			int num = 0;
			while(P%i == 0) {
				num++;
				P/=i;
			}
			A.add(new Pair(i,num));
		}
		A.add(new Pair(P,1));

		long ans = 1;
		for(int i = 0;i < A.size();i++) {
			long buf;
			Pair p = A.get(i);
			buf = (p.getNum()/N) * p.getx();
			if(buf!=0)ans *= buf;
		}
		System.out.println(ans);
	}
}

class Pair{
	long x;
	long num;
	Pair(long x,long num){
		this.x = x;
		this.num = num;
	}

	long getNum() {
		return num;
	}

	long getx() {
		return x;
	}
}
