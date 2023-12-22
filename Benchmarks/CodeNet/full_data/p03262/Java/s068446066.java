import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    static int N;
    static int X;
    static int[] xx;

    private static void init() {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        X = scanner.nextInt();
        xx = new int[N];
        for(int i = 0; i < N; i++) {
            xx[i] = scanner.nextInt();
        }
        scanner.close();
    }


    public static void main(String args[]) {
        init();

        if(N != 1) {
            PriorityQueue<Integer> eachMaxDqueue = new PriorityQueue<>(Collections.reverseOrder());
            for (int i = 0; i < N; i++) {
                eachMaxDqueue.add(Math.abs(X - xx[i]));
            }

            int max = 0;
            while (!eachMaxDqueue.isEmpty()) {
                Integer maxD = eachMaxDqueue.poll();
                for (int i = maxD; 0 < i; i--) {
                    for (int j = 0; j < N; j++) {
                        int dist1 = X - maxD;
                        if (dist1 == xx[j]) {
                            for (int k = 0; k < N; k++) {
                                for (int l = 1; l < xx[k]; l++) {
                                    int dist2 = (maxD * l + xx[j]) - xx[k];
                                    if (dist2 == 0) {
                                        max = maxD;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
            }

            System.out.println(max);
        } else {
            System.out.println(Math.abs(X - xx[0]));
        }
    }
}