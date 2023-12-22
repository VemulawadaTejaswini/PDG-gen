import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        PriorityQueue<Integer> q = new PriorityQueue<Integer>();
        int cnt = 0;
        for (int i=0;i<N;i++) {
            int P = sc.nextInt();
            q.add(P);
            if (q.peek()==P) cnt++;
        }
        System.out.println(cnt);
    }
}