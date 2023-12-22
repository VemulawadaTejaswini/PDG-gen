import java.util.Scanner;
import java.util.StringJoiner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long s = sc.nextLong();
        StringJoiner sj = new StringJoiner(" ");
        sj.add("0");
        sj.add("0");
        sj.add("1000000000");
        sj.add(String.valueOf(s / 1_000_000_000));
        sj.add(String.valueOf(s % 1_000_000_000));
        sj.add("1");
        System.out.println(sj);
        System.out.println(1_000_000_000 * (s / 1_000_000_000) * (s % 1_000_000_000));
    }

}
