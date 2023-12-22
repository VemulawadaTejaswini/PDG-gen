import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long H = Long.parseLong(s.next());
        System.out.println(atack(H));
    }

    // 再帰でやるとこう
    static long atack(long h) {
        if (h == 1) {
            return 1;
        }
        return atack(h / 2) * 2 + 1;
    }

}
