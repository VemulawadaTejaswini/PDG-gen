import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Sccanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        if (N - K > 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}