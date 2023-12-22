import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int sum = A + B;
        int multi = A * B;
        int minus = A - B;
        if (sum > multi && sum > minus) {
            System.out.println(sum);
        }
        if (multi > sum && multi > minus) {
            System.out.println(multi);
        }
        if (minus > multi && minus > sum) {
            System.out.println(minus);
        }

    }
}
