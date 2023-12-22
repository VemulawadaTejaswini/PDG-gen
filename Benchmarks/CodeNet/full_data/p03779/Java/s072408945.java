import java.util.*;

public class Main {

    public static void main(String[] args) {

        // write your code here
        Scanner sc = new Scanner(System.in);

        long x = sc.nextLong();
        long sum = 0;
        long i = 1;

        for (; sum < x ; i++) {
            sum += i;
        }

        System.out.println(i - 1);
    }
}