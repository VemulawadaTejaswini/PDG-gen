import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int M = Integer.parseInt(sc.next());

        int max = M / N;
        for (int n = max - 1 ; n >= 1 ; n++) {
            if (max % n == 0) {
                System.out.println(max / n);
                return;
            }
        }
    }
}