import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int[] a = new int[5];
            for (int i = 0; i < a.length; i++) {
                a[i] = in.nextInt();
            }
            int k = in.nextInt();
            for (int i = 0; i < a.length; i++) {
                for (int j = i + 1; j < a.length; j++) {
                    if (a[j] - a[i] > k) {
                        System.out.println(":(");
                        return;
                    }
                }
            }
            System.out.println("Yay!");
        }
    }
}
