import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next()); // 整数
        int k = Integer.parseInt(sc.next()); // 基数
        ArrayList<Integer> list = new ArrayList<>();
        while (n >= 1) {
            list.add(n % k);
            n /= k;
        }
        System.out.println(list.size());
        sc.close();
    }
}
