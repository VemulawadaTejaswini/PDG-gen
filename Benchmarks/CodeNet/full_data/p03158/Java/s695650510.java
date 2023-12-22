import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            new Main().solve(sc);
        }
    }

    void solve(Scanner sc) {
        int n = sc.nextInt();
        int q = sc.nextInt();
        LinkedList<Long> aList = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            aList.add(sc.nextLong());
        }

        for (int i = 0; i < q; i++) {
            long ans = 0l;
            Long x = sc.nextLong();
            LinkedList<Long> tmpList = new LinkedList<>();
            for (long l : aList) {
                tmpList.add(l);
            }

            while (!tmpList.isEmpty()) {
                ans += tmpList.removeLast();

                if (tmpList.isEmpty()) {
                    break;
                }

                int targetIndex = Collections.binarySearch(tmpList, x);
                if (targetIndex > 0) {
                    tmpList.remove(targetIndex);
                } else {
                    targetIndex = -(targetIndex + 1);
                    if (targetIndex == 0) {
                        tmpList.remove(targetIndex);
                    } else {
                        if (Math.abs(x - tmpList.get(targetIndex - 1)) < Math
                                .abs(x - tmpList.get(Math.min(targetIndex, tmpList.size() - 1)))) {
                            tmpList.remove(targetIndex - 1);
                        } else {
                            tmpList.remove(Math.min(targetIndex, tmpList.size() - 1));
                        }
                    }
                }
            }
            System.out.println(ans);
        }
    }
}
