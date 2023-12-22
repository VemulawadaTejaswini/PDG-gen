// https://abc112.contest.atcoder.jp/tasks/abc112_b
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int input_N = Integer.parseInt(sc.next());
		int input_T = Integer.parseInt(sc.next());
 
        // programming
        int min_cost = Integer.MAX_VALUE;
        boolean is_found = false;
        for (int i = 0; i < input_N; i++) {
            int c = Integer.parseInt(sc.next());
            int t = Integer.parseInt(sc.next());
            if (t <= input_T && c < min_cost) {
                is_found = true;
                min_cost = c;
            }
        }

        if (is_found) {
            System.out.println(min_cost);
        } else {
            System.out.println("TLE");
        }
	}
}