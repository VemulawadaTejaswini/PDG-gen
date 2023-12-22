import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int min = (n - m) * 100 + m * 1900;
        System.out.println(min * (int) Math.pow(2, m));
    }
}
