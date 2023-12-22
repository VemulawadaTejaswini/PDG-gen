import java.util.*;

class Main {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int D = sc.nextInt();
        int x = sc.nextInt();

        int sum = x;
        for (int i = 1; i <= 10; i++) {
            sum = i * sum - D;
            System.out.println(sum);
        }
    }
}