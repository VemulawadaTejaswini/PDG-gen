import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int k = sc.nextInt();
        Set<Integer> set = new TreeSet<>();
        for (int i = a ; i < k + a ; i++) {
            if (i <= b) {
                set.add(i);
            }
        }
        for (int i = b - k + 1 ; i <= b ; i++) {
            if (i >= a) {
                set.add(i);
            }
        }
        for (Integer x : set) {
            System.out.println(x);
        }
    }

}
