import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] ary = new int[N];

        for (int i = 0; i < N; i++) {
            ary[i] = sc.nextInt();
        }

        int count = 0;
        while (true) {
            boolean isContinuable = false;
            int minEvenVal = Integer.MAX_VALUE;
            int minEvenPos = -1;

            for (int i = 0; i < N; i++) {
                if (ary[i] % 2 == 0) {
                    isContinuable = true;
                    if (ary[i] < minEvenVal) {
                        minEvenVal = ary[i];
                        minEvenPos = i;
                    }
                }
            }

            if (!isContinuable) { break; }

            for (int i = 0; i < N; i++) {
                if (i == minEvenPos) {
                    ary[i] /= 2;
                    continue;
                }
                ary[i] *= 3;
            }

            count++;
        }

        System.out.println(count);
    }
}
