import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int D = in.nextInt();
        int N = in.nextInt();

        int ans = N;
        for (int i = 0; i < D; ++i)
            ans *= 100;

        System.out.println(ans);
    }
}