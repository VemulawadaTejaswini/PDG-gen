import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        int[] antenas = new int[5];
        for (int i = 0; i < 5; i++) {
            antenas[i] = kbd.nextInt();
        }
        int k = kbd.nextInt();
        System.out.println(tushin(antenas, k));
    }

    static String tushin(int[] antenas, int k) {
        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 5; j++) {
                if (antenas[j] - antenas[i] > k) {
                    return ":(";
                }
            }
        }
        return "Yay!";
    }
}