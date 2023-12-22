import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeSet;

class ball implements Comparable<ball>{
	int num, id;
	public ball(int n, int i) {
		num = n; id = i;
	}
	public int compareTo(ball o) {
		if(num == o.num) return id - o.id;
		return num - o.num;
	}
}
class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), K = sc.nextInt();
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0; i < N; i++) {
			int A = sc.nextInt();
			if(map.containsKey(A)) map.put(A, map.get(A) + 1);
			else map.put(A, 1);
		}
		/* 本質 */
		int ans = 0;
		TreeSet<ball> balls = new TreeSet<ball>();
		for(Entry<Integer, Integer> e : map.entrySet()) {
			balls.add(new ball(e.getValue(), e.getKey()));
		}
		while(balls.size() > K) {
			ans += balls.pollFirst().num;
		}
		System.out.println(ans);
	}
}