import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long H = sc.nextLong();
        long count = 0;
        long mCount = 1;
        while (H != 0) {
            count += mCount;
            mCount *= 2;
            if (H % 2 == 1) {
                H = (H - 1) / 2;
            } else {
                H = H / 2;
            }
        }
        System.out.println(count);
    }
}