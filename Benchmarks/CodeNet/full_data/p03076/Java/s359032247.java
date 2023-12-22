import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] time = new int[5];
        int sum = 0;
        int min = 10;
        for (int i = 0; i < 5; i++) {
            time[i] = sc.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            if (time[i] % 10 == 0)
                sum += time[i];
            else
                sum += time[i] + 10 - time[i] % 10;
        }
        for (int i = 0; i < 5; i++) {
            if (time[i] % 10 != 0) {
                if (min > time[i] % 10) {
                    min = time[i] % 10;
                }
            }
        }
        System.out.println(sum - (10 - min));
    }
}