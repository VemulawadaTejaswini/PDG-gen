import java.util.*;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for(int i = 0; i < n; i++) {
            queue.add(sc.nextInt());
        }

        int ans = 0;
        for(int i = 0; i < n - 1; i++) {
            ans += queue.poll();
        }
        ans += queue.poll() / 2;

        // 出力
        System.out.println(ans);
    }
}
