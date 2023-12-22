import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc  = new Scanner(System.in);
        //Scanner sc = new Scanner(new FileReader("input.txt"));

        int arrayNum = sc.nextInt();
        long[] a = new long[arrayNum];
        long[] b = new long[arrayNum];

        for (int i = 0; i < arrayNum; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }

        long margin = 0;

        for (int i = arrayNum - 1; i >= 0; i--) {
            long objective = a[i] + margin;
            long base = b[i];

            while (objective++ % base != 0) {
                margin++;
            }

            a[i] = objective;

        }

        System.out.println(margin);
    }
}