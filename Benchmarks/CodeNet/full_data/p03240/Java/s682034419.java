import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Element> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int h = sc.nextInt();
            list.add(new Element(x, y, h));
        }
        sc.close();

        // 高度の降順でソート
        Collections.sort(list, (e1, e2) -> e2.h - e1.h);
//        System.out.println(list);

        // Cx, Cy は全組み合わせ 101 x 101 ≒ 10,000通りを全通り検証可能
        // 1)高度hiが != 0 の場合でHを求める。そのHが他の条件を満たすことを確認する
        // 2)すべてのhiが 0 の場合、hiはHの単調増加関数であるため、H=1で検証する

        // list.get(0).h != 0
        for (int cx = 0; cx <= 100; cx++) {
            for (int cy = 0; cy <= 100; cy++) {
                Element e = list.get(0);
                int hCandidate = e.h + Math.abs(e.x - cx) + Math.abs(e.y - cy);
                boolean isOk = true;
                for (int i = 1; i < n; i++) {
                    Element ei = list.get(i);
                    int hi = evaluate(hCandidate, ei.x, ei.y, cx, cy);
                    if (hi != ei.h) {
                        isOk = false;
                        break;
                    }
                }
                if (isOk) {
                    System.out.println(cx + " " + cy + " " + hCandidate);
                    System.exit(0);
                }
            }
        }
    }

    static int evaluate(int hCandidate, int x, int y, int cx, int cy) {
        return Math.max(hCandidate - Math.abs(x - cx) - Math.abs(y - cy), 0);
    }

    static class Element {
        int x;
        int y;
        int h;

        Element(int x, int y, int h) {
            this.x = x;
            this.y = y;
            this.h = h;
        }

        @Override
        public String toString() {
            return "(x=" + x + ", y=" + y + ", h=" + h + ")";
        }
    }

}
