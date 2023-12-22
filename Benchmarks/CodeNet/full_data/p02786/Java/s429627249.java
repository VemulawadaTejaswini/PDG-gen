import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long hp = sc.nextLong();
        System.out.println(hit(hp));
    }

    private static long hit(long hp) {
        return hp == 1 ? 1 : hit(hp / 2) * 2 + 1;
    }
}