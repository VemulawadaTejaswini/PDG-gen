import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();

        Deque<Long> deque = new ArrayDeque<>();
        for (long i = 1; i < 10; i++) {
            deque.add(i);
        }

        for (int i = 1; i < k; i++) {
            long v = deque.pop();
            long matubi = v % 10;
            v *= 10;
            switch ((int)matubi) {
                case 0:
                    deque.add(v);
                    deque.add(++v);
                    break;
                case 9:
                    deque.add(v + matubi - 1);
                    deque.add(v + matubi);
                    break;
                default:
                    deque.add(v + matubi - 1);
                    deque.add(v + matubi);
                    deque.add(v + matubi + 1);
                    break;
            }
        }

        System.out.println(deque.pop());
    }
}