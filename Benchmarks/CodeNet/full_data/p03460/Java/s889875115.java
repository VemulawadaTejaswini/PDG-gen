import java.util.Scanner;

public class Main {
    private int n;
    private int k;
    private int[] x;
    private int[] y;
    private String[] c;

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        x = new int[n];
        y = new int[n];
        c = new String[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
            c[i] = sc.next();
        }

        int max = 0;

        // 今回の0,0の内容と色を決める
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < k; j++) {
                for (int h = 0; h < 2; h++) {
                    // trueがW で falseがB
                    boolean colorFlag = h % 2 == 0;
                    // (0,0)のWでスタート
                    int count = calculate(i, j, colorFlag);
                    if (max < count) {
                        max = count;
                    }
                }
            }
        }
        System.out.println(max);
    }

    public int calculate(int baseX, int baseY, boolean colorFlag) {
//        System.out.println("baseX:" + baseX + " baseY:" + baseY + " colorFlag:" + colorFlag);
        int count = 0;
        for (int i = 0; i < n; i++) {
            int absoluteX = baseX + x[i];
            int absoluteY = baseY + y[i];

            int t = absoluteX / k + absoluteY / k;

            boolean cf = colorFlag;
            if (t % 2 == 1) {
                // baseX,baseYと違う色
                cf = !colorFlag;
            }

            String color = cf ? "W" : "B";
            if (color.equals(c[i])) {
                count++;
            }
        }
        return count;
    }
}
