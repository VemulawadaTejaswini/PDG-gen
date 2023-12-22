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
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                if (map[i + 1][j + 1] == 0) {
                    continue;
                }
                if (j + 1 - map[i][j] == i + 1) {
                    continue;
                }
                map[i + 1][j + 1] = map[i][j] + 1;
                max = Math.max(max, map[i + 1][j + 1]);
            }
        }
        System.out.println(max);
        sc.close();
    }
}
