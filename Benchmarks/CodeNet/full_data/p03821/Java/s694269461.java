import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc  = new Scanner(System.in);
        //Scanner sc = new Scanner(new FileReader("input.txt"));

        int arrayNum = sc.nextInt();
        int[] a = new int[arrayNum];
        int [] b = new int[arrayNum];

        for (int i = 0; i < arrayNum; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }

        int margin = 0;

        for (int i = arrayNum - 1; i >= 0; i--) {
            int objective = a[i] + margin;
            int base = b[i];

            while (objective++ % base != 0) {
                margin++;
            }

            a[i] = objective;

        }

        System.out.println(margin);
    }
}