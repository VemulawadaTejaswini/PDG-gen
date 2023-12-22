import java.util.*;

public class Main {

    public static int minFee(int n, int a, int b) {
        return n * a < b ? n * a : b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(minFee(n, a, b));
    }

}
