import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
       int N = std.nextInt();
       int[] V = IntStream.range(0, N).map(it -> std.nextInt()).toArray();
       int[] C = IntStream.range(0, N).map(it -> std.nextInt()).toArray();
       Integer ans = 0;
       for (int i = 0; i < N; i++) {
           Integer v = V[i];
           Integer c = C[i];
           Integer res = v - c;
           if (res > 0) {
               ans += res;
           }
       }

       System.out.println(ans);
    }
}
