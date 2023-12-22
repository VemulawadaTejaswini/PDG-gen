import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        long[] array = new long[N+1];
        long[] brray = new long[N];

        for (int i=0; i<N+1; i++) {
            array[i] = scanner.nextLong();
        }
        for (int i=0; i<N; i++) {
            brray[i] = scanner.nextLong();
        }

        int aIndex = 0;
        int bIndex = 0;
        long count = 0;
        while (aIndex < N+1 && bIndex < N) {
            if (array[aIndex] <= 0) {
                aIndex++;
                continue;
            }
            if (brray[bIndex] <= 0) {
                bIndex++;
                continue;
            }

            if (aIndex - bIndex > 1) {
                bIndex++;
                continue;
            }

            if (bIndex > aIndex) {
                aIndex++;
                continue;
            }

            if (array[aIndex] > brray[bIndex]) {
                long tmpCount = brray[bIndex];
                array[aIndex] -= tmpCount;
                brray[bIndex] -= tmpCount;
                count += tmpCount;
            } else {
                long tmpCount = array[aIndex];
                array[aIndex] -= tmpCount;
                brray[bIndex] -= tmpCount;
                count += tmpCount;
            }
        }
        System.out.println(count);
    }
}