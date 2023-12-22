import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char originalMap[][] = new char[n][n];
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            for (int j = 0; j < n; j++) {
                originalMap[i][j] = s.charAt(j);
            }
        }
        int cnt = 0;
        // a,bはずらす値
        for (int a = 0; a < n; a++) {
            B: for (int b = 0; b < n; b++) {
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        int ni = (i + a) % n;
                        int nj = (j + b) % n;
                        int nni = (j + a) % n;
                        int nnj = (i + b) % n;
                        if (originalMap[ni][nj] == originalMap[nni][nnj]) {
                        } else {
                            continue B;
                        }
                    }
                }
                cnt++;
            }
        }
        System.out.println(cnt);
        sc.close();
    }
}
