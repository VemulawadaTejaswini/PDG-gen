import java.util.*;
import java.text.DateFormat;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int count = 0;
        if (a <= b) {
            count = a;
        } else {
            count = a - 1;
        }

        System.out.println(count);
    }
}
