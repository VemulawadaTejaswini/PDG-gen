import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        int sum = 0;

        if (x < 4) {
            switch (x) {
                case 1: sum += 100000;
                case 2: sum += 100000;
                case 3: sum += 100000;
                    break;
            }
        }

        if (y < 4) {
            switch (y) {
                case 1: sum += 100000;
                case 2: sum += 100000;
                case 3: sum += 100000;
                    break;
            }
        }

        if (x + y == 2) {
            sum += 400000;
        }

        System.out.println(sum);
    }
}