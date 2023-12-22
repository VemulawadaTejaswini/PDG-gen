import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Queue<Integer> A = new PriorityQueue<Integer>(n);

        for (int i = 0; i < n; i++) {
            A.add(sc.nextInt());
        }
        for (int i = 0; i < m; i++) {
            int b = sc.nextInt();
            int c = sc.nextInt();
            for (int j = 0; j < b; j++) {
                if (A.peek() >= c) {
                    break;
                } else {
                    A.poll();
                    A.add(c);
                }
            }
        }

        sc.close();
        long answer = 0;
        for (int a : A) {
            answer += a;
        }
        System.out.println(answer);
    }
}
