import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Map<Character, Set<String>> map = new HashMap<>();
		for(int i =0; i < n; i++){
			String s = sc.next();
			char c = s.charAt(0);
			if(c == 'M' || c == 'A' || c == 'R' || c == 'C' || c=='H'){
				if(!map.containsKey(c)) map.put(c, new HashSet<>());
				map.get(c).add(s);
			}
		}
		if(map.keySet().size() < 3){
			System.out.println(0);
			return;
		}
		long l = 0;
		int keySize = map.keySet().size();
		List<Character> list = new ArrayList<>(map.keySet());
		int x;
		for(int i =0; i< list.size() -2; i++){
			for(int j =i+1; j < list.size()-1; j++){
				for(int k = j+1; k < list.size(); k++){
					x =1;
					x *= map.get(list.get(i)).size() * map.get(list.get(j)).size() * map.get(list.get(k)).size();
					l +=x;
				}
			}
		}
		System.out.println(l);
	}
}