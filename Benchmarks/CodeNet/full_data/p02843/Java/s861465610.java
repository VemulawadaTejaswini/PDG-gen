import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        boolean isOK = x % 100 == 0;

        if (!isOK) {
            int amari = x % 100;
            int atari = x / 100;
            if (atari * 5 >= amari) {
                isOK = true;
            }
        }

        System.out.println(isOK ? 1 : 0);
    }
}