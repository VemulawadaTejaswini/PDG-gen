import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.next());
        int A = Integer.parseInt(sc.next());
        int B = Integer.parseInt(sc.next());

        int sum = 0;
        for (int i = 1; i < N + 1; i++) {

            int tmp = addPerDegit(i);

            if (A <= tmp && tmp <= B) {
                sum += i;
            }
        }
        System.out.println(sum);
    }

    private static int addPerDegit(int i) {
        int sum = 0;
        while (i > 0) {
            // 10の余りを足していく
            sum += i % 10;
            i /= 10;
        }
        return sum;
    }
}
