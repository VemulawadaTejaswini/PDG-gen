import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = n;
        int fx = 0;
        while (true) {
            if (i / 10 != 0) {
                fx += i % 10;
                i /= 10;
            } else {
                fx += i;
                break;
            }
        }
        if (n % fx == 0)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
