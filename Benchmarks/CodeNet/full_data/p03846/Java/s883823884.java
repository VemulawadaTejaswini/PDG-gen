import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] valuesCount = new int[N];
        for (int i = 0; i < N; i++) {
            int value = sc.nextInt();
            valuesCount[value] = valuesCount[value] + 1;
        }

        if (N % 2 == 1) {
            if (valuesCount[0] != 1) {
                System.out.println(0);
                return;
            }

            for (int i = 2; i < N; i += 2) {
                if (valuesCount[i] != 2) {
                    System.out.println(0);
                    return;
                }
            }
        } else {
            for (int i = 1; i < N; i += 2) {
                if (valuesCount[i] != 2) {
                    System.out.println(0);
                    return;
                }
            }
        }
        System.out.println((int)Math.pow(2, N / 2));
    }
}