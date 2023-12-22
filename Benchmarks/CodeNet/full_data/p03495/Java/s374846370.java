import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int K = scn.nextInt();
		HashMap<Integer, Integer> ball = new HashMap<Integer,Integer>();
		for(int i = 0;i < N;i++) {
			int a = scn.nextInt();
			if(ball.containsKey(a)) {
				ball.replace(a, ball.get(a)+1);
			}else {
				ball.put(a, 1);
			}
		}
		ArrayList<SSS> set = new ArrayList<SSS>();
		for(int a:ball.keySet()) {
			set.add(new SSS(a,ball.get(a)));
		}
		SSS[] a = new SSS[set.size()];
		Arrays.sort(set.toArray(a));
		int ans = 0;
		for(int i = 0;i < a.length - K;i++) {
			ans += a[i].getNum();
		}
		System.out.println(ans);
	}

}
class SSS implements Comparable<SSS>{
	int num;
	int seed;
	SSS(int seed,int num){
		this.seed = seed;
		this.num = num;
	}

	int getNum() {
		return this.num;
	}

	@Override
	public int compareTo(SSS o) {
		if(this.getNum() > o.getNum())return 1;
		if(this.getNum() < o.getNum())return -1;
		return 0;
	}
}
