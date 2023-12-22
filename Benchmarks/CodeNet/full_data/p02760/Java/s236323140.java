import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }
    
    int[][] a;
    int n;
    int[] b;

    public void run() {
        // 入力情報取得
        Scanner sc = new Scanner(System.in);
        a = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        n = sc.nextInt();
        b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        sc.close();

        // 解答処理
        solve();
    }
    
    private void solve() {
        if (check()) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
    
    private boolean check() {
        int[][] res = new int[3][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    if (b[i] == a[j][k]) {
                        res[j][k] = 1;
                    }
                }
            }
        }
        if (check_row(res) || check_col(res) || check_nnm(res)) {
            return true;
        } else {
            return false;
        }
    }

    private boolean check_row(int[][] res) {
        if (res[0][0] == 1 && res[1][0] == 1 && res[2][0] == 1) {
            return true;
        } else if (res[0][1] == 1 && res[1][1] == 1 && res[2][1] == 1) {
            return true;
        } else if (res[0][2] == 1 && res[1][2] == 1 && res[2][2] == 1) {
            return true;
        } else {
            return false;
        }
    }

    private boolean check_col(int[][] res) {
        if (res[0][0] == 1 && res[0][1] == 1 && res[0][2] == 1) {
            return true;
        } else if (res[1][0] == 1 && res[1][1] == 1 && res[1][2] == 1) {
            return true;
        } else if (res[2][0] == 1 && res[2][1] == 1 && res[2][2] == 1) {
            return true;
        } else {
            return false;
        }
    }
    
    private boolean check_nnm(int[][] res) {
        if (res[0][0] == 1 && res[1][1] == 1 && res[2][2] == 1) {
            return true;
        } else if (res[0][2] == 1 && res[1][1] == 1 && res[2][0] == 1){
            return true;
       } else {
            return false;
        }
    }
}