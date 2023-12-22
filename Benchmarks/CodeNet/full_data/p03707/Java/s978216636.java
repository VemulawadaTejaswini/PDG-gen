import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;
        int q;
        n = sc.nextInt();
        m = sc.nextInt();
        q = sc.nextInt();
        sc.nextLine();
        boolean[] board = new boolean[n*m];
        for (int i = 0; i < n; i++) {
            char[] tmp = sc.nextLine().toCharArray();
            for (int j = 0; j < m; j++) {
                board[i*m+j] = tmp[j] == '1';
            }
        }

        int[][] counts = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0 ; j < m; j++) {
                if (board[i*m+j]){
                    if (j == 0)
                        counts[i][j]++;
                    else
                        counts[i][j] = counts[i][j-1]+1;
                }
            }
        }

        for (int i = 1 ; i < n; i++) {
            for (int j = 0; j < m; j++) {
                counts[i][j] += counts[i-1][j];
            }
        }

        int[][] colNums = new int[n][m];
        int[][] rowNums = new int[n][m];
        boolean flag = false;
        for (int i = 0; i < n; i++) {
            flag = false;
            for (int j = 0; j < m; j++) {
                if (board[i*m+j]) {
                    if (j == 0)
                        rowNums[i][0] = 1;
                    else if (!flag) {
                        rowNums[i][j] = rowNums[i][j-1] + 1;
                        flag = true;
                    }
                    else {
                        rowNums[i][j] = rowNums[i][j-1];
                    }
                }
            }
        }

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < m; j++) {
                rowNums[i][j] += rowNums[i-1][j];
            }
        }


        for (int i = 0; i < n; i++) {
            flag = false;
            for (int j = 0; j < m; j++) {
                if (board[i*m+j]) {
                    if (j == 0)
                        colNums[0][i] = 1;
                    else if (!flag) {
                        colNums[j][i] = colNums[j-1][i] + 1;
                        flag = true;
                    }
                    else {
                        colNums[j][i] = colNums[j-1][i];
                    }
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < m; j++) {
                colNums[i][j] += colNums[i][j-1];
            }
        }

        for (int i = 0; i < q; i++) {
            int x1 = sc.nextInt()-1;
            int y1 = sc.nextInt()-1;
            int x2 = sc.nextInt()-1;
            int y2 = sc.nextInt()-1;
            int ans = calc(counts, x1, y1, x2, y2);
            ans -= calc(rowNums, x1, y1, x2, y2);
            ans -= calc(colNums, x1, y1, x2, y2);
            System.out.println(ans);
        }
    }

    static int calc(int[][] arr, int x1, int y1, int x2, int y2) {
        int ret = 0;
        ret = arr[x2][y2] + arr[x1][y1] - arr[x2][y1] - arr[x1][y2];
        return ret;
    }
}
