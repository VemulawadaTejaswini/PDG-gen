import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ary = new int[5];
        for (int i = 0; i < 5; i += 1) {
            ary[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        for (int i = 0; i < 5; i += 1) {
            for (int j = i + 1; j < 5; j += 1) {
                if (ary[j] - ary[i] > k) {
                    System.out.println(":(");
                    return;
                }
            }
        }
        System.out.println("Yay!");
    }

}
