import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long H = sc.nextLong();
        System.out.println(attack(H));
        sc.close();
    }

    static long attack(long hp) {
        if (hp == 1) {
            return 1;
        }
        return attack(hp / 2) * 2 + 1;
    }
}