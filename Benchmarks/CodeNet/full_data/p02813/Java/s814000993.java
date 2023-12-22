import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String P = "";
		for (int i = 0; i < N; i++) P += sc.next();
		String Q = "";
		for (int i = 0; i < N; i++) Q += sc.next();
		List<String> list = new ArrayList<>();
		permutation(P,"",list);
		Collections.sort(list);
		int a = list.indexOf(P) + 1;
		int b = list.indexOf(Q) + 1;
		System.out.println(Math.abs(a - b));
	}
	
	public static void permutation(String q, String p,List<String> list){
		if(q.length() <= 1) {
			list.add(p + q);
		} else {
			for (int i = 0; i < q.length(); i++) {
				permutation(q.substring(0, i) + q.substring(i + 1),
						p + q.charAt(i),list);
			}
		}
	}
}