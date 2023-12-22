import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int h = sc.nextInt();
        int w = sc.nextInt();
        sc.nextLine();

        boolean[][] data = new boolean[h][w];

        for (int i=0; i < h; i++) {
            String s = sc.nextLine();
            char[] ch = s.toCharArray();
            for (int j = 0; j < w; j++) {
                data[i][j] = ch[j] == '#';
            }
        }

        int max = 0;
        boolean[][] done = new boolean[data.length][data[0].length];

        for (int i=0; i < h; i++) {
            for (int j=0; j < w; j++) {

                if (!data[i][j] && !done[i][j]) {
                    int deepest = max(w-j-1, j, h-i-1, i);

                    // System.out.println("Start search at [" + i + " " + j + "], deepest: " + deepest);
                    search:
                    for (int k=1; k <= deepest; k++) {

                        for (int di=-k; di <= k; di++) {
                            int dj = k - Math.abs(di);

                            // System.out.println("k, di, dj: " + k + " " + di + " " + dj);

                            if (isInRange(i+di, j+dj, h, w) && !done[i+di][j+dj]) {
                                done[i+di][j+dj] = true;
                                // System.out.println("done: [" + (i+di) + " " + (j+dj) + "]");
                                if (data[i+di][j+dj]) {
                                    max = max(max, k);
                                    break search;
                                }
                            }

                            dj = -dj;
                            if (isInRange(i+di, j+dj, h, w) && !done[i+di][j+dj]) {
                                done[i+di][j+dj] = true;
                                // System.out.println("done: [" + (i+di) + " " + (j+dj) + "]");
                                if (data[i+di][j+dj]) {
                                    max = max(max, k);
                                    break search;
                                }
                            }
                        }

                    }

                }

            }
        }

        System.out.println(max);
    }

    private static int max(int... a) {
        int max = a[0];
        for (int i : a) {
            if (max < i) max = i;
        }
        return max;
    }

    private static boolean isInRange(int i, int j, int h, int w) {
        return 0 <= i && i < h && 0 <= j && j < w;
    }


}
