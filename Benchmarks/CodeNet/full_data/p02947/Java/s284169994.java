import java.util.*;
 
public class Main {
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Map<String, Long> map = new HashMap<>();
    for (int i = 0; i < n; i++) {
        char[] s = sc.next().toCharArray();
        Arrays.sort(s);
        map.compute(String.valueOf(s), (key, value) -> value == null ? 1 : value + 1);
    }
    long ans = 0;
    for (long val : map.values()) {
        ans += val * (val - 1) / 2;
    }
    System.out.println(ans);
	}
}
