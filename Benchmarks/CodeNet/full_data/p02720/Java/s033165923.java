import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        sc.close();

        List<Long> que = new ArrayList<>();
        for (int i = 1; i <= 9; i++) {
            enqueue(i, que);
        }
        int count = 1;
        while (true) {
            long val = dequeue(que);
            if (count == K) {
                System.out.println(val);
                break;
            }
            if (val % 10 != 0) {
                enqueue((val * 10) + (val % 10) - 1, que);
            }
            enqueue((val * 10) + (val % 10), que);

            if (val % 10 != 9) {
                enqueue((val * 10) + (val % 10) + 1, que);
            }
            count++;
        }
    }

    public static void enqueue(long val, List<Long> que) {
        que.add(val);
    }

    public static long dequeue(List<Long> que) {
        long val = que.get(0);
        que.remove(0);
        return val;
    }

}
