import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.println(nC2(n) + nC2(m));
    }
    static int nC2(int n) {
        return n * (n - 1) / 2;
    }
}
