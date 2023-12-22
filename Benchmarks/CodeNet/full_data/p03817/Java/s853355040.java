import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long count = n / 11;
        long mod = n % 11;
        int plus = 0;
        if (mod > 0) plus++;
        if (mod > 5) plus++;
        long res = count * 2 + plus;
        System.out.println(res);
    }
}
