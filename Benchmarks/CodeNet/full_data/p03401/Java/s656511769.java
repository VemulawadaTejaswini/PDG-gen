import java.util.*;

public class Main {

    private int N;
    private int[] A;

    public void inputData() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        A = new int[N+2];
        for (int i = 1; i <= N; i++) {
            A[i] = sc.nextInt();
        }
    }

    public void printAnswer() {
        for (int i = 0; i < N; i++) {
            int dist = 0;
            for (int j = 1; j < N+2; j++) {
                if (j != i + 1) {
                    dist += Math.abs(A[j] - A[j-1]);
                } else {
                    dist += Math.abs(A[j+1] - A[j-1]);
                    j++;
                }
            }
            System.out.println(dist);
        }
    }

    public void run() {
        inputData();
        printAnswer();
    }

    public static void main(String[] args) {
        (new Main()).run();
    }

}
