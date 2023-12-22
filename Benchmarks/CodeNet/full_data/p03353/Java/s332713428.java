import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		int k = sc.nextInt();
		HashSet<String> hash = new HashSet<String>();
		String str;
		ArrayList<String> strs = new ArrayList<String>();
		for(int i = 0; i < input.length(); i++) {
			for(int j = i+1; j <= input.length(); j++) {
				str = input.substring(i, j);
				if(hash.contains(str) == false) {
					hash.add(str);
					strs.add(str);
				}
			}
		}
		Collections.sort(strs);
		System.out.println(strs.get(k-1));
	}
}
