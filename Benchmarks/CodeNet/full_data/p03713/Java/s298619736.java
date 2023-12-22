import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        if (H % 3 == 0 || W % 3 == 0) {
            System.out.println(0);
        } else {
            int h1 = 0;
            int h2 = 0;
            int h3 = 0;
            int w1 = 0;
            int w2 = 0;
            int w3 = 0;
            int a1 = 0;
            int a2 = 0;
            int a3 = 0;
            int min = Integer.MAX_VALUE;
            for (int i = 1; i <= H; i++) {
                h1 = i;
                // 縦が最大でない場合
                if (h1 != H) {
                    // 横は最大
                    w1 = W;
                    a1 = h1 * w1;
                    // h2とh3はH-h1
                    h2 = H - h1;
                    h3 = H - h1;
                    // w2は1からW-1
                    for (int j = 1; j < W; j++) {
                        w2 = j;
                        a2 = h2 * w2;
                        // w3 はW-w2
                        w3 = W - w2;
                        a3 = h3 * w3;
                        ArrayList<Integer> list = new ArrayList<>();
                        list.add(a1);
                        list.add(a2);
                        list.add(a3);
                        Collections.sort(list);
                        int diff = list.get(2) - list.get(0);
                        if (diff < min) {
                            min = diff;
                        }
                    }
                }
                // 縦が最大の場合
                else {
                    // は1からW-1
                    for (int j = 1; j < W; j++) {
                        w1 = j;
                        a1 = h1 * w1;
                        // w2は1からW-w1
                        for (int k = 1; k <= W - w1; k++) {
                            w2 = k;
                            // w2が最大の場合
                            if (k == W - w1) {
                                // w2とw3は同じ
                                w3 = w2;
                                // h2は1からH-1
                                for (int l = 1; l < H; l++) {
                                    h2 = l;
                                    a2 = w2 * h2;
                                    h3 = H - h2;
                                    a3 = w3 * h3;
                                    ArrayList<Integer> list = new ArrayList<>();
                                    list.add(a1);
                                    list.add(a2);
                                    list.add(a3);
                                    Collections.sort(list);
                                    int diff = list.get(2) - list.get(0);
                                    if (diff < min) {
                                        min = diff;
                                    }
                                }
                            }
                            // w2が最大でない場合
                            else {
                                // w3 はW - w1 -w2
                                w3 = W - w1 - w2;
                                // h2とh3はH
                                h2 = H;
                                h3 = H;
                                a2 = w2 * h2;
                                a3 = w3 * h3;
                                ArrayList<Integer> list = new ArrayList<>();
                                list.add(a1);
                                list.add(a2);
                                list.add(a3);
                                Collections.sort(list);
                                int diff = list.get(2) - list.get(0);
                                if (diff < min) {
                                    min = diff;
                                }
                            }
                        }
                    }
                }
            }
            System.out.println(min);
        }
    }
}
