import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private void solve() {
        // 入力処理
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Task> tasks = new ArrayList<Task>();
        for (int i = 0; i < N; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            tasks.add(new Task(A, B));
        }

        // 締め切りの早い順に並び替える。ソートはラムダ式を使うのが便利。
        tasks.sort((a,b)-> a.deadLine - b.deadLine);
        //for (Task task : tasks) {
        //    System.out.println(task.timeToTake + " " + task.deadLine);
        //}

        // 判定処理
        long timeSum = 0;
        String ans = "Yes";
        for (Task task : tasks) {
            timeSum += task.timeToTake;
            if (timeSum > task.deadLine) {
                ans = "No";
                break;
            }
        }
        System.out.print(ans);
    }

    class Task {
        int timeToTake;
        int deadLine;
        Task (int timeToTake, int deadLine) {
            this.timeToTake = timeToTake;
            this.deadLine = deadLine;
        }
    }

    // Main
    public static void main(String[] args) {
        new Main().solve();
    }
}

