import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int A = Integer.parseInt(in.next());
		int B = Integer.parseInt(in.next());
		int K = Integer.parseInt(in.next());
		int c = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i = A; i < A+K && i < B; i++){
			list.add(i);
		}
		for(int i = B; i > B-K && i > A; i--){
			list.add(i);
		}
		Collections.sort(list);
		List<Integer> a = new ArrayList<Integer>(new HashSet<>(list));
		for(int i = 0; i < a.size(); i++)System.out.println(a.get(i));
	}
}