import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    static class Task {
        int tq, dl;
        public Task(int timeReq, int deadLine){
            tq = timeReq;
            dl = deadLine;
        }
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int tCur, tReq = 0;
        boolean poss = true;
        ArrayList<Task> tasks = new ArrayList<>();
        for (int i = 0; i < n; i++){
            tasks.add(new Task(in.nextInt(), in.nextInt()));
        }
        tasks.sort(new Comparator<Task>() {
            @Override
            public int compare(Task o1, Task o2) {
                return o1.dl == o2.dl ? 0 : o1.dl > o2.dl ? 1 : -1;
            }
        });
        for (int i = 0; i < n; i++){
            Task temp = tasks.get(i);
            tCur = temp.dl;
            tReq += temp.tq;
            if (tReq > tCur){
                poss = false;
                break;
            }
        }
        System.out.println(poss ? "Yes" : "No");
    }
}
