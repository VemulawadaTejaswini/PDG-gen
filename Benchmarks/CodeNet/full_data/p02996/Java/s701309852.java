import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        List<Task> tasklist = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            Task t = new Task();
            t.time = scan.nextLong();
            t.dead = scan.nextLong();
            tasklist.add(t);
        }
        tasklist.sort(new TaskComparator());
        boolean answer = simulate(N, tasklist);
        System.out.println(answer ? "Yes" : "No");
    }
    public boolean simulate(int N, List<Task> tasklist) {
        long elapsed_time = 0;
        for (int i = 0; i < N; i++) {
            Task t = tasklist.get(i);
            elapsed_time += t.time;
            if (t.dead < elapsed_time) {
                return false;
            }
        }
        return true;
    }
    class Task {
        long time;
        long dead;
    }
    class TaskComparator implements Comparator<Task> {
        @Override
        public int compare(Task o1, Task o2) {
            if (o1.dead == o2.dead) {
                return Long.compare(o1.time, o2.time);
            }
            return Long.compare(o1.dead, o2.dead);
        }
    }
}
