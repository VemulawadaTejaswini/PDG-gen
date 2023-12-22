import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        LinkedList<Integer>[] a = new LinkedList[n];
        for(int i=0; i<n; i++) {
            LinkedList<Integer> ai = new LinkedList<>();
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
                done[i] = false;
            }
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
                    a[i].pop();
                    a[op].pop();
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
