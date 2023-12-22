import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int map[][] = new int[h][w];
        ArrayList<Operate> op = new ArrayList<>();
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                map[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < h; i++) {
            if (i % 2 == 0) {
                // 偶数行目 左 => 右
                for (int j = 0; j < w - 1; j++) {
                    if (map[i][j] % 2 == 0) {
                        continue;
                    } else {
                        // [[i][j]はあまりがある
                        op.add(new Operate(i, j, i, j + 1));
                        map[i][j + 1]++;
                    }
                }
                // 最下段でない
                if (i != h - 1) {
                    if (map[i][w - 1] % 2 == 0) {
                        continue;
                    } else {
                        // [[i][j]はあまりがある
                        op.add(new Operate(i, w - 1, i + 1, w - 1));
                        map[i + 1][w - 1]++;
                    }
                }
            } else {
                for (int j = w - 1; j > 0; j--) {
                    if (map[i][j] % 2 == 0) {
                        continue;
                    } else {
                        // [[i][j]はあまりがある
                        op.add(new Operate(i, j, i, j - 1));
                        map[i][j - 1]++;
                    }
                }
                // 最下段でない
                if (i != h - 1) {
                    if (map[i][0] % 2 == 0) {
                        continue;
                    } else {
                        // [[i][j]はあまりがある
                        op.add(new Operate(i, 0, i + 1, 0));
                        map[i + 1][0]++;
                    }
                }
            }
        }
        System.out.println(op.size());
        for (Operate operate : op) {
            operate.show();
        }

        sc.close();
    }
}

class Operate {

    int i, j, ni, nj;

    Operate(int i, int j, int ni, int nj) {
        this.i = i + 1;
        this.j = j + 1;
        this.ni = ni + 1;
        this.nj = nj + 1;
    }

    public void show() {
        System.out.println(i + " " + j + " " + ni + " " + nj);
    }
}
