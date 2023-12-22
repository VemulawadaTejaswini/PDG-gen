import java.util.*;

public class Main {
	public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Map<String, Integer> map = new HashMap<String, Integer>();

	 	int n = sc.nextInt();
    for (int i = 0; i < n; i++) {
      String s = sc.next();
      if (map.get(s) == null) {
        map.put(s, 1);
      } else {
        map.put(s, map.get(s) + 1);
      }
    }

    int m = sc.nextInt();
    for (int i = 0; i < m; i++) {
      String t = sc.next();
      if (map.get(t) == null) {
        map.put(t, -1);
      } else {
        map.put(t, map.get(t) - 1);
      }
    }

    int answer = 0;
		for (String key : map.keySet()) {
			int value = map.get(key);
			if (value > answer) {
				answer = value;
			}
		}

    System.out.println(answer);
  }
}
