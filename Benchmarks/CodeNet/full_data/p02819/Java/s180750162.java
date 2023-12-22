import java.util.*;
import java.io.*;

public class Main {

    public static boolean[] composite;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        init();

        int X = in.nextInt();

        while (X < composite.length && composite[X]) {
            ++X;
        } System.out.println(X);
    }

    private static void init() {
        composite = new boolean[(int) 1e5 + 5];
        composite[0] = composite[1] = true;
        composite[2] = false;
        for (int i = 4; i < composite.length; i += 2) {
            composite[i] = true;
        }

        for (int i = 3; i < composite.length; i+= 2) if (!composite[i]) {
            for (int j = i + i; j < composite.length; j += i) {
                composite[j] = true;
            }
        }
    }
}