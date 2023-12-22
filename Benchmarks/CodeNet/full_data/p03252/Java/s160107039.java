import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	void doIt() {
		Map<Character, Character> map = new HashMap<Character, Character>();
		char[] s = sc.next().toCharArray();
		char[] t = sc.next().toCharArray();
		int len = s.length;
		for(int i = 0; i < len; i++) {
			if(!map.containsKey(s[i])) {
				map.put(s[i], t[i]);
			}
			else if(map.get(s[i]) != t[i]) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}
	Main(){doIt();}
	public static void main(String[] args) {
		new Main();
	}

}
