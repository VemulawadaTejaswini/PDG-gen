import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    int count = 0;
    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Integer> heights = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            heights.add(sc.nextInt());
        }
        calcCount(heights);
        System.out.print(count);
    }

    void calcCount(List<Integer> heights) {
        // 脱出条件
        if (heights.size() == 0) {
            return;
        }
        if (heights.size() == 1) {
            count += heights.get(0);
            return;
        }

        int minHeight = Collections.min(heights);
        if (minHeight > 0) {
            // Integer 型のまま扱えば、もっと簡単にできるかも。
            for (int i = 0; i < heights.size(); i++) {
                int height = heights.get(i);
                heights.set(i, height - minHeight);
            }
            count += minHeight;
        }

        List<Integer> subHeights = new ArrayList<>();
        for (int i = 0; i < heights.size(); i++) {
            int height = heights.get(i);
            // 0 が来て一区切りなので、ここまでをcalcCount()にかける。
            if (height == 0) {
                if (subHeights.size() != 0) {
                    calcCount(subHeights);
                    subHeights.clear();
                }
            }
            // 部分集合の最後まで来たので、ここまでをcalcCount()にかける。
            else if (i == (heights.size() - 1)) {
                subHeights.add(height);
                calcCount(subHeights);
                subHeights.clear();
            }
            else {
                subHeights.add(height);
            }
        }
    }

    // Main
    public static void main(String[] args) {
        new Main().solve();
    }
}