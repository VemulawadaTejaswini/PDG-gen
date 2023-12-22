import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int r = scanner.nextInt();
        int ml = l % 2019;
        int mr = r % 2019;

        if (r - l + 1 >= 2019) {
            System.out.println(0);
        } else if (ml > mr) {
            System.out.println(0);
        } else {
            if (ml <= 673 && mr >= 673 && (mr - ml + 1 >= 3 || ml % 3 == 0 || mr % 3 == 0)) {
                System.out.println(0);
            } else {
                System.out.println((ml * (ml + 1) % 2019));
            }
        }


    }
}