import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int k = sc.nextInt();

		Queue<String> queue = new ArrayDeque<>();
		SortedSet<String> set = new TreeSet<>();
		queue.add(s);
		String str;
		while((str = queue.poll()) != null){
			for(char c = 'a'; Character.isAlphabetic(c); c++){
				for(int i = 0; i < str.length(); i++){
					if(str.charAt(i) != c) continue;
					String subS = str.substring(i);
					queue.add(subS);
					for(int j = 1; j <= subS.length(); j++){
						set.add(subS.substring(0, j));
					}
				}
				if(set.size() >= k) break;
			}
			if(set.size() >= k) break;
		}
		System.out.println(new ArrayList<>(set).get(k-1));
	}
}