import java.io.File;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Queue<Integer>[] a = new LinkedList[n];
        for(int i=0; i<n; i++) {
            Queue<Integer> ai = new LinkedList<>();
            for(int j=0; j<n-1; j++) {
                ai.add(in.nextInt());
            }
            a[i] = ai;
        }

        int days;
        int matches = n * (n-1) / 2;
        for(days=0; days<matches; days++) {
            boolean[] done = new boolean[n];
            boolean progress = false;
            boolean allEmpty = true;
            for(int i=0; i<n; i++) {
                if(a[i].isEmpty()) {
                    continue;
                }
                allEmpty = false;
                if(done[i]) {
                    continue;
                }
                int op = a[i].peek() - 1;
                if(a[op].isEmpty()) {
                    continue;
                }
                int opop = a[op].peek() - 1;
                if(i == opop && !done[op]) {
                    done[i] = true;
                    done[op] = true;
                    a[i].poll();
                    a[op].poll();
                    progress = true;
                }
            }
            if(allEmpty) {
                break;
            }
            if(!progress) {
                days = -1;
                break;
            }
        }
        System.out.println(days);
    }
}
