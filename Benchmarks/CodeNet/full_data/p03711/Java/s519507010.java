import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        List<Integer> a = new ArrayList();
        a.add(1);
        a.add(3);
        a.add(5);
        a.add(7);
        a.add(8);
        a.add(10);
        a.add(12);
        List<Integer> b = new ArrayList();
        b.add(4);
        b.add(6);
        b.add(9);
        b.add(11);
        List<Integer> c = new ArrayList();
        b.add(2);
        if (a.contains(x) && a.contains(y)) {
            System.out.println("Yes");
        } else if (b.contains(x) && b.contains(y)) {
            System.out.println("Yes");
        } else if (c.contains(x) && c.contains(y)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
