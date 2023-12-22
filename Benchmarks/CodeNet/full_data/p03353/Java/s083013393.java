import java.util.Scanner;
import java.util.TreeSet;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next(); int K = sc.nextInt();
		TreeSet<String> ans = new TreeSet<String>();
		for(int i = 0; i < s.length(); i++) {
			for(int j = i + 1; j <= s.length(); j++) {
				String sub = s.substring(i, j);
				ans.add(sub);
				while(ans.size() > K) ans.pollLast();
			}
		}
		while(K > 1) {
			ans.pollFirst();
			K--;
		}
		System.out.println(ans.pollFirst());
	}
}