import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());

        for (int i = 1; i <= N; i++) {
            if ((int) (i * 1.08) == N) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(":(");
    }
}
