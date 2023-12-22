import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int l = sc.nextInt();
        int r = sc.nextInt();
        int min = 2019;
        for (int i = 0; i < r - l + 1; i++) {
            for (int j = i + 1; j < r - l + 1; j++) {
                if ((l + i) % 2019 * (l + j) % 2019 < min)
                    min = (l + i) % 2019 * (l + j) % 2019;
            }
        }
        System.out.println(min);
    }
}