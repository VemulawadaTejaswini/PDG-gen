import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<Element> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            list.add(new Element(a, b));
        }
        Collections.sort(list, (e1, e2) -> e1.a - e2.a);
        sc.close();

        long ans = 0;
        int needsNum = m;
        while (needsNum > 0) {
            Element e = list.remove(0);
            if (e.b <= needsNum) {
                ans += (long) e.a * (long) e.b;
                needsNum -= e.b;
            } else {
                ans += (long) e.a * (long) needsNum;
                needsNum = 0;
            }
        }
        System.out.println(ans);
    }

    static class Element {
        int a;
        int b;

        Element(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }
}
