import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        long[] harr = new long[N];

        for (int i=0; i<N; i++) {
            harr[i] = scanner.nextLong();
        }

        int result = 0;
        for (int i=0; i< N-1; i++) {
            if (result >= (N-1 - i)) break;
            int tmp = 0;
            for (int k=i; k< N-1; k++) {
                if (harr[k] >= harr[k+1]) {
                    tmp++;
                } else {
                    break;
                }
            }
            if (tmp > result) {
                result = tmp;
            }
        }

        System.out.println(result);
    }
}