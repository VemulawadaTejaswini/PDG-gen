
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int L = scanner.nextInt();

        int absMinTaste = 1000;
        int pieTaste = 0;
        for (int i = 1 ; i <= N ; i++) {
            int taste = L + i - 1;
            pieTaste += taste;
            if (Math.abs(absMinTaste) > Math.abs(taste)) {
                absMinTaste = taste;
            }
        }

        System.out.println(pieTaste - absMinTaste);
    }
}
