

import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String ans = "YES";
        int[] h  = IntStream.range(0, sc.nextInt())
            .map(i -> sc.nextInt())
            .toArray();
        
        for (int i = 1; i < h.length; i++ ) {
            if (h[i] - h[i - 1] > 1) {
                ans = "NO";
                break;
            }
        }
        System.out.println(ans);

        sc.close();
    }
}