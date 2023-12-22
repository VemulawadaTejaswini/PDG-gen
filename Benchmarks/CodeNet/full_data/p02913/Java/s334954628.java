import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int map[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            for (int j = i + 1; j < n; j++) {
                char cc = s.charAt(j);
                if (c == cc) {
                    // 同じ数字を記録しておく
                    map[i][j] = 1;
                }
            }
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // i,jはstartの場所
                if (map[i][j] != 1) {
                    continue;
                }
                int count = 0;
                while (true) {
                    if (map[i + count][j + count] == 1) {
                        count++;
                        if (j + count >= n) {
                            break;
                        }
                        if (j == i + count) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                max = Math.max(max, count);
            }
        }
        System.out.println(max);
        sc.close();
    }
}
