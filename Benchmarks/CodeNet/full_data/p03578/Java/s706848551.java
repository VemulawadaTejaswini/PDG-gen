import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		int N = Integer.parseInt(in.next());
		String ans = "Yes";
		for(int i = 0; i<N; i++) {
			int D = Integer.parseInt(in.next());
			if (map.containsKey(D))map.put(D,map.get(D)+1);
			else map.put(D,1);
		}
		int M = Integer.parseInt(in.next());
		for(int i = 0; i<M; i++) {
			int T =Integer.parseInt(in.next());
			if (map.containsKey(T)&&map.get(T)>0)map.put(T,map.get(T)-1);
			else {
				ans = "No";
				break;
			}
		}
		System.out.println(ans);
	}
}