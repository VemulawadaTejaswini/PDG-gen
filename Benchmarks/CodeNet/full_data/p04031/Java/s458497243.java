import java.util.*;
 
class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int ans = 100;
		ArrayList<Integer> ary = new ArrayList<Integer>();
		
		for(int i = 0; i < N; i ++) {
			ary.add(Integer.parseInt(sc.next()));
		}
		for(int i = -100; i <= 100; i++) {
			int x = 0;
			for(int y = 0;y < ary.size(); y++) {
				x += (ary.get(y) - i) * (ary.get(y) - i);
			}
			ans = Math.min(x, ans);
		}
		System.out.println(ans);
	}
}