import java.util.Scanner;

public class Main {
    private static long count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = Long.valueOf(sc.next());

        getCount(x);

        System.out.println(String.valueOf(count));

    }

    public static void getCount(long x) {
        count = (x / 11) * 2;
        long diff = x % 11;

        if (diff < 6) {
            count++;
        } else if (diff > 6) {
            count = count + 2;
        } else if (diff == 0 || diff == 6) {
            //何もしない
        }
    }
}