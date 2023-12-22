import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int N = Integer.parseInt(in.next());
		SortedMap<Integer,Integer> list = new TreeMap<Integer,Integer>();
		for (int i = 0; i < N; i++){
			list.put(Integer.parseInt(in.next()),Integer.parseInt(in.next()));
		}
		System.out.println(list.lastKey()+list.get(list.lastKey()));
	}
}