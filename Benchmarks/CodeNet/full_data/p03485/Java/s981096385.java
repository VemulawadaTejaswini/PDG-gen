import java.util.Scanner;

public class Main {
    // https://atcoder.jp/contests/abc082/tasks/abc082_a
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();

        double x = (a + b) / 2;

        System.out.println(x);

        int answer = (int) Math.ceil(x);

        System.out.println(answer);

        scan.close();
    }

}
