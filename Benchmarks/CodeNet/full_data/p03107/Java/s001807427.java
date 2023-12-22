import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		ArrayList<Character> ansList = new ArrayList<>();
		int ans = 0;

		for (char c: s.toCharArray()){
			if (ansList.size() == 0){
				ansList.add(c);
			}else if (ansList.get(ansList.size()-1) != c){
				ansList.remove(ansList.size()-1);
				ans += 2;
			}else {
				ansList.add(c);
			}
		}
		System.out.println(ans);
	}
}
