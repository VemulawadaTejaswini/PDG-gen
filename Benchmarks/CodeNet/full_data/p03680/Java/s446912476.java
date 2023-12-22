import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        int pivot = A[0];
        if (pivot == 2) {
            System.out.println(1);
            return;
        }
        for (int i = 1; i < N; i++) {
            pivot = A[pivot - 1];
            if (pivot == 2) {
                System.out.println(i + 1);
                return;
            }
        }
        System.out.println(-1);
    }
}