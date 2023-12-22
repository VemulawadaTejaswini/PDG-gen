import java.util.*;

public class Main {

    public static void main(String[] args) {
        // input
        Scanner sc = new Scanner(System.in);
        long h = sc.nextInt();
        long w = sc.nextInt();
        long odd = w / 2;
        if (w % 2 == 1) {
            odd++;
        }
        long even = w - odd;
        long hOdd = h / 2;
        if (h % 2 == 1) {
            hOdd++;
        }
        long hEven = h - hOdd;
        System.out.println(hOdd * odd + even * hEven);
    }
}
