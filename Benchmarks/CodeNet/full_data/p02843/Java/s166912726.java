import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int[] prices = { 100, 101, 102, 103, 104, 105 };
        int index = 5;
        while (x > 0) {
            if (x % 100 == 0) {
                System.out.println(1);
                return;
            } else if (x % 100 < index) {
                index--;
            } else {
                x -= prices[index];
            }
        }

        System.out.println(x == 0 ? 1 : 0);
    }
}