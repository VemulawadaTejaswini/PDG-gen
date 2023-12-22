
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        long[][] list = new long[N][2];


        for (int i=0; i<N; i++) {
            list[i][0] = sc.nextInt();
            list[i][1] = sc.nextInt();
        }

        Arrays.sort(list, (a, b) -> Long.compare(a[0], b[0]));

        long result = 0;
        for (int i=0; i<N; i++) {
            System.out.print(list[i][0]);
            System.out.println(list[i][1]);

            if (M>list[i][1]) {
                result += list[i][0] * list[i][1];
                M -= list[i][1];
            } else {
                result += list[i][0] * M;
                break;
            }
        }

        System.out.println(result);
    }
}