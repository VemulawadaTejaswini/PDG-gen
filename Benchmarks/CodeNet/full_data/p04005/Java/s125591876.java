import java.util.Arrays;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long[] abc = new long[3];
        long allBlocks = 1;

        for (int i = 0; i < 3; i++) {
            abc[i] = sc.nextInt();
            allBlocks *= abc[i];
        }

        Arrays.sort(abc);

        System.out.println(abc[2] % 2 == 0 ? 0: abc[0] * abc[1]);
    }

}
