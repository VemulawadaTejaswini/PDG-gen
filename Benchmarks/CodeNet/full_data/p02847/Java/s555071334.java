import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = Long.parseLong(sc.next());
        long B = Long.parseLong(sc.next());
        long X = Long.parseLong(sc.next());

        if ((A + B) > X) {
            System.out.println(0);
            return;
        }
        long result = 0L;
        for (long i = (X - B) / A; i >= 0; i--) {
            long keta = String.valueOf(i).length();
            if (A * i + B * keta <= X) {
                if (i >= 1000000000) {
                    result = 1000000000;
                } else {
                    result = i;
                }
                break;
            }
        }

        System.out.println(result);
    }
}