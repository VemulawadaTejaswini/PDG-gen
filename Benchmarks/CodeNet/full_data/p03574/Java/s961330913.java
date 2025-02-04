import java.util.Scanner;

class Main {
    void solve() {
        Scanner in = new Scanner(System.in);
        int h = in.nextInt(), w = in.nextInt(); in.nextLine();
        char[][] c = new char[h][w];
        for(int i = 0; i < h; i++) {
            String string = in.nextLine();
            c[i] = string.toCharArray();
        }
        for(int i = 0; i < h; i++) {
            for(int j = 0; j < w; j++) {
                if(c[i][j] == '#') {
                    System.out.print(c[i][j]);
                }else {
                    int[] dx = {-1, 0, 1, 1, 1, 0, -1, -1},
                            dy = {-1, -1, -1, 0, 1, 1, 1, 0};
                    int ans = 0;
                    for(int k = 0; k < 8; k++) {
                        if(0 <= i +dy[k]&& i +dy[k] < h && 0 <= j +dx[k] && j +dx[k] < w) {
//                            System.out.println((i + dy[k]) + " " + (j + dx[k]));
                            if(c[i + dy[k]][j + dx[k]] == '#') {
                                ans++;
                            }
                        }
                    }
                    System.out.print(ans);
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Main().solve();
    }
}
