import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        class Task implements Comparable<Task>{
        int cost;
        int dead;
        public Task(int cost, int dead){
            this.cost = cost;
            this.dead = dead;
        }

        @Override
        public int compareTo(Task o) {
            if(this.dead > o.dead){
                return 1;
            }else{
                return -1;
            }
            }
        }
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        ArrayList<Task> tasks = new ArrayList<>();
        for(int i=0; i<N; i++){
            int cost = scanner.nextInt();
            int dead = scanner.nextInt();
            tasks.add(new Task(cost, dead));
        }
        Collections.sort(tasks);

        int time = 0;

        for(Task task: tasks){
            if(time + task.cost > task.dead){
                System.out.println("No");
                return;
            }
            time += task.cost;
        }
        System.out.println("Yes");

    }
}
