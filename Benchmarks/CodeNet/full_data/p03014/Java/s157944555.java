import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        char[][] map = new char[h][w];
        for (int i = 0; i < h; i++) {
            String s = sc.next();
            for (int j = 0; j < w; j++) {
                map[i][j] = s.charAt(j);
            }
        }
        int yoko[][] = new int[h][w];
        for (int i = 0; i < h; i++) {
            int count = 0;
            int pos = 0;
            for (int j = 0; j < w; j++) {
                if (map[i][j] == '.') {
                    count++;
                } else {
                    for (int k = pos + 1; k < j; k++) {
                        yoko[i][k] = count;
                    }
                    pos = j;
                    count = 0;
                }
            }
        }
        int tate[][] = new int[h][w];
        for (int j = 0; j < w; j++) {
            int count = 0;
            int pos = 0;
            for (int i = 0; i < h; i++) {
                if (map[i][j] == '.') {
                    count++;
                } else {
                    for (int k = pos + 1; k < j; k++) {
                        yoko[k][j] = count;
                    }
                    pos = j;
                    count = 0;
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                int tmp = yoko[i][j] + tate[i][j];
                if (ans < tmp) {
                    ans = tmp;
                }
            }
        }
        System.out.println(ans);
        sc.close();
    }
}