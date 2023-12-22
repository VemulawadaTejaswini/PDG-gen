import java.util.*;
import java.util.regex.Pattern;

public class Main {

    static int N;

    static Queue<Integer>[] queues;

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        N = s.nextInt();

        queues = new Queue[N+1];

        for (int i = 1; i <= N; i++) {

            queues[i] = new LinkedList<Integer>();

            for (int j = 0; j < N-1; j++) {

                queues[i].add(s.nextInt());
            }
        }

        int day = 0;

        boolean repeatFlag = true;

        for (; repeatFlag == true; day++) {

            repeatFlag = false;

            boolean endFlag = true;

            boolean[] check = new boolean[N+1];

            for (int i = 1; i <= N; i++) {

                if (check[i] == true) continue;

                Queue<Integer> queue = queues[i];

                if (queue.isEmpty() == false) {

                    repeatFlag = true;

                    int firstTeam = queue.peek();

                    int teamIndex = i;

                    if (queues[firstTeam].peek() == teamIndex && check[firstTeam]== false) {

                        endFlag = false;

                        check[i] = true;


                        check[firstTeam] = true;

                        queues[firstTeam].poll();

                        queue.poll();
                    }
                }
            }

            if (endFlag == true && repeatFlag == true) {

                System.out.println(-1);

                return;
            }
        }

        System.out.println(day-1);
    }
}
