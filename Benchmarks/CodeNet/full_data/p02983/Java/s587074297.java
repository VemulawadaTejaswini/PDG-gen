import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int d = input.nextInt();

        long remain = (long)(2 * Math.pow(10,9)) * 2;
        for (int i = n; i < d; i++) {
            for (int j = i + 1; j <= d; j++) {
                if((i*j)%2019 < remain)
                    remain = (i*j)%2019;
            }
        }
        System.out.println(remain);
    }
}
