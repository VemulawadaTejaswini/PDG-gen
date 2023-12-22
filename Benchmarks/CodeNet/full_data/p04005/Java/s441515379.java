import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        long a = sc.nextInt();
        long b = sc.nextInt();
        long c = sc.nextInt();

        if (a % 2 == 0 || b % 2 == 0 || c % 2 == 0) {
            System.out.println(0);
        } else {
            long[] array = {a, b, c};
            Arrays.sort(array);
            System.out.println(array[0] * array[1]);
        }
    }
}