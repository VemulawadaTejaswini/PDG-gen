import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.nextLine());
        Integer[] an = new Integer[N];
        for (int i = 0; i < N; i++) {
            an[i] = Integer.parseInt(sc.next());
        }

        // 効率よくカードを引くのでソートする
        Arrays.sort(an, Comparator.reverseOrder());

        int alice = 0;
        int bob = 0;
        for (int i = 0; i < N; i++) {
            if (i % 2 == 0) {
                alice += an[i];
            } else {
                bob += an[i];
            }

        }

        System.out.println(alice - bob);
    }
}
