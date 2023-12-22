import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        ArrayList<Task> tasks = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            tasks.add(new Task(sc.nextInt(), sc.nextInt()));
        }

        Collections.sort(tasks, new Comparator<Task>() {
            public int compare(Task t1, Task t2) {
                return ((Integer)t1.getEnd()).compareTo(t2.getEnd());
            }
        });

        int time = 0;
        boolean isOver = false;
        for (int i = 0; i < N; i++) {
            Task task = tasks.get(i);
            time += task.getCost();
            if (time > task.getEnd()) {
                isOver = true;
                break;
            }
        }

        if (isOver) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }

    private static class Task{
        private int a;
        private int b;

        private Task(int a, int b) {
            this.a = a;
            this.b = b;
        }

        private int getCost() {
            return a;
        }

        private int getEnd() {
            return b;
        }
    }
}