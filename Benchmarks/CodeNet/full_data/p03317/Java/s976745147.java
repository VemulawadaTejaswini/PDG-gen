import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] A = new int[N];
        int index = -1;
        int counter = 0;
        for (int i = 0; i < A.length; i++) {
            A[i] = sc.nextInt();
            if (A[i] == 1) {
                index = i;
            }
        }
        if (index > K - 1) {
            index = K - 1;
            counter++;
        } else {
            counter += (index + K - 2) / (K - 1);
        }
        int right = N - 1 - index;
        counter += (right + K - 2) / (K - 1);
        System.out.println(counter);
        sc.close();
    }
}