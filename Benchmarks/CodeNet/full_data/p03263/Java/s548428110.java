import java.util.*;

public class Main {
    public void main(Scanner sc) {
        int h = sc.nextInt();
        int w = sc.nextInt();
        int data[][] = new int[h][w];

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                data[i][j] = sc.nextInt() % 2;
            }
        }
        sc.close();

        List<String> ans = new ArrayList<>();
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (data[i][j] == 1) {
                    if (j + 1 < w) {
                        data[i][j + 1] ^= 1;
                        ans.add(toString(i, j, i, j + 1));
                    } else if (i + 1 < h) {
                        data[i + 1][j] ^= 1;
                        ans.add(toString(i, j, i + 1, j));
                    }
                    data[i][j]--;
                }
            }
        }

        System.out.println(ans.size());
        ans.forEach(s -> System.out.println(s));
    }

    private String toString(int sx, int sy, int gx, int gy) {
        return ++sx + " " + ++sy + " " + ++gx + " " + ++gy;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
    }
}
