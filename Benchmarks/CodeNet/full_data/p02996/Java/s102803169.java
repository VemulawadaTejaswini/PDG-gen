import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        List<Task> tasks = new ArrayList<Task>();
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            tasks.add(new Task(a[i], b[i]));
        }
        Collections.sort(tasks);
        boolean flag = true;
        int day = 0;
        for (int i = 0; i < n; i++) {
            Task t = tasks.get(i);
            if (day + t.time > t.fin) {
                flag = false;
                break;
            } else {
                day += t.time;
            }
        }
        if (flag) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        sc.close();
    }
}

class Task implements Comparable<Task> {
    int time;
    int fin;

    Task(int time, int fin) {
        this.time = time;
        this.fin = fin;
    }

    @Override
    public int compareTo(Task other) {
        if (this.fin < other.fin) {
            return -1;
        } else if (this.fin > other.fin) {
            return 1;
        } else {
            if (this.time < other.time) {
                return -1;
            } else {
                return 1;
            }
        }
    }

}
