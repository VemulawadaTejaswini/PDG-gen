import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int k = sc.nextInt();
        int[][] s  = new int[h][w];
        for (int i = 0 ; i < h ; i++) {
            String d = sc.next();
            for (int j = 0 ; j < w ; j++) {
                s[i][j] = Integer.valueOf(d.substring(j, j+1));
            }
        }
        int[][] a = new int[1024][10];
        for (int i = 0 ; i < Math.pow(2, h) ; i++) {
            int n = i;
            for (int j = 0 ; j < 10 ; j++) {
                a[i][j] = n % 2;
                n /= 2;
            }
        }
        int max = 1000000;
        for (int i = 0 ; i < Math.pow(2, h) ; i++) {
            List<Integer> list = new ArrayList<Integer>();
            int c = 0;
            for (int j = 0 ; j < 10 ; j++) {
                if (a[i][j] == 1) {
                    list.add(j);
                    c++;
                }
            }
            int wc[] = new int[list.size() + 1];
            int g = 0;
            for (int j = 0 ; j < w ; j++) {
                int col = 0;
                int index = 0;
                if (list.size() == 0) {
                    int temp = 0;
                    for (int l = 0 ; l < h ; l++) {
                        if (s[l][j] == 1) temp++;
                    }
                    g += temp;
                    if (g > k) {
                        c++;
                        g = temp;
                    }
                }
                for (int l = 0 ; l < h ; l++) {
                    if (l <= list.get(index)) {
                        if (s[l][j] == 1) {
                            wc[index]++;
                        }
                    } else {
                        index++;
                        if (l <= list.get(index)) {
                            if (s[l][j] == 1) {
                                wc[index]++;
                            }
                        }
                    }
                }
                boolean flg = true;
                for (int l = 0 ; l < wc.length ; i++) {
                    if (wc[l] > k) flg = false;
                }
                if (!flg) {
                    c++;
                    Arrays.fill(wc, 0);
                    index = 0;
                    for (int l = 0 ; l < h ; l++) {
                        if (l <= list.get(index)) {
                            if (s[l][j] == 1) {
                                wc[index]++;
                            }
                        } else {
                            index++;
                            if (l <= list.get(index)) {
                                if (s[l][j] == 1) {
                                    wc[index]++;
                                }
                            }
                        }
                    }
                }
            }
            max = Math.min(c, max);
        }
        System.out.println(max);
    }

}