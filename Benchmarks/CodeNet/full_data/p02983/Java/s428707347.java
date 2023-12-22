import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();

        long min = 9999999999L;
        for (; l <= r; l++) {
            for (int i = l + 1; i <= r; i++) {
                // System.out.printf("%s * %s mod 2019 = %s\n", l, i, ((l * i) % 2019));
                min = Math.min(min, (l * i) % 2019);
            }
        }
        System.out.println(min);
    }
}
