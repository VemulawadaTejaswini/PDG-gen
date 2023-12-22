
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int evenCount = sc.nextInt();
        int oddCount = sc.nextInt();

        int evenComb = comb(evenCount);
        int oddComb = comb(oddCount);

        System.out.println(evenComb + oddComb);
    }

    static int comb(int a) {
        if (a < 2) {
            return 0;
        }

        return (a * (a - 1)) / 2;
    }
}
