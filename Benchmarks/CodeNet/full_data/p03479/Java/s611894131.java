import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long y = sc.nextLong();
        long maxLen = 1l;
        while (true) {
            if ((double) (y / x) < (long) Math.pow(2, maxLen)) {
                break;
            }
            maxLen++;
        }
        System.out.println(maxLen);
    }

}
