import java.util.Scanner;

public class Main {
    public static int N = 0;
    public static int[] A;
    public static int[] B;

    public static void main(String[] args) {

        String[] aStrArray;
        String[] bStrArray;

        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        sc.nextLine();

        aStrArray = sc.nextLine().split(" ");
        A = new int[N + 1];
        for (int i = 0; i < N + 1; i++) {
            A[i] = Integer.parseInt(aStrArray[i]);
        }
        bStrArray = sc.nextLine().split(" ");
        B = new int[N];
        for (int i = 0; i < N; i++) {
            B[i] = Integer.parseInt(bStrArray[i]);
        }

        int tmp = 0;
        int remainingA = A[N];
        for (int i = N - 1; i >= 0; i--) {
            remainingA = A[i] + remainingA;
            if (B[i] >= remainingA) {
                tmp += remainingA;
                remainingA = 0;
            } else {
                tmp += B[i];
                remainingA = remainingA - B[i];
            }
        }
        System.out.println(tmp);
    }
}
