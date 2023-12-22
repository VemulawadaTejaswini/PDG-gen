import java.util.Scanner;

public class Main {
    // https://atcoder.jp/contests/abc082/tasks/abc082_a
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        double x = (a + b) / 2;

        int answer = (int) Math.round(x);

        System.out.println(answer);

        scan.close();
    }

}
