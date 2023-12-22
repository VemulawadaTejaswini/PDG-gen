import java.util.HashMap;
import java.util.Scanner;

class Main {
	int n;
	HashMap<Integer,Integer> map;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Main m = new Main(sc);
		m.solve();
		sc.close();
	}

	Main(Scanner sc) {
		n = sc.nextInt();
		map = new HashMap<Integer,Integer>();
		for(int i=0;i<n;i++){
			int a = sc.nextInt();
			if(map.containsKey(a)){
				map.replace(a, map.get(a)+1);
			} else {
				map.put(a, 1);
			}
			
		}
	}

	void solve() {
		int max = Integer.MIN_VALUE;
		for(int x=0;x<=1.0e+5+1;x++){
			max = Math.max(max, map.getOrDefault(x-1, 0) + map.getOrDefault(x,0) + map.getOrDefault(x+1,0));
		}
		System.out.println(max);
	}
}
