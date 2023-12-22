import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int d = sc.nextInt();
        int[][] a = new int[h][w];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        int q = sc.nextInt();
        int[][] l = new int[q][2];
        for (int i = 0; i < q; i++) {
            for (int j = 0; j < 2; j++) {
                l[i][j] = sc.nextInt();
            }
        }
        sc.close();

        for (int i = 0; i < q; i++) {
            int magic = 0;
            if (l[i][0] == l[i][1]) {
                System.out.println(magic);
                continue;
            } else {
                int x = 0, y = 0;
                int current = l[i][0];
                int goal = l[i][1];
                loop_1: for (int m = 0; m < h; m++) {
                    for (int n = 0; n < w; n++) {
                        if (l[i][0] == a[m][n]) {
                            x = m;
                            y = n;
                            System.out.println(x + " " + y);
                            break loop_1;
                        }
                    }
                }
                while (current != goal) {
                    int next_x = 0, next_y = 0;
                    loop_2: for (int m = 0; m < h; m++) {
                        for (int n = 0; n < w; n++) {
                            if ((current + d) == a[m][n]) {
                                next_x = m;
                                next_y = n;
                                break loop_2;
                            }
                        }
                    }
                    magic += Math.abs(x - next_x) + Math.abs(y - next_y);
                    current += d;
                    x = next_x;
                    y = next_y;
                }
                System.out.println(magic);
            }
        }
    }
}
