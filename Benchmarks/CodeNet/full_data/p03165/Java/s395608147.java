import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] a = scanner.nextLine().toCharArray();
        char[] b = scanner.nextLine().toCharArray();
        Node[][] dp = new Node[a.length][b.length];
        boolean flag = false;
        for (int i = 0; i < a.length; i++) {
            if(a[i] == b[0]) {
                dp[i][0] = new Node(1, i-1, 0);
            } else {
                dp[i][0] = new Node(0, i-1, 0);
            }

        }
        flag = false;
        for (int i = 0; i < b.length; i++) {
            if(a[0] == b[i]) {
                dp[0][i] = new Node(1, 0, i-1);
            } else {
                dp[0][i] = new Node(0, 0, i-1);
            }
        }

        for (int i = 1; i < a.length; i++) {
            for (int j = 1; j < b.length; j++) {
                if(a[i] == b[j]) {
                    dp[i][j] = new Node(dp[i-1][j-1].len + 1, i-1, j-1);
                } else {
                    if(dp[i-1][j].len>=dp[i][j-1].len) {
                        dp[i][j] = new Node(dp[i-1][j].len, i-1, j);
                    } else {
                        dp[i][j] = new Node(dp[i][j-1].len, i, j-1);
                    }
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        int i = a.length -1, j = b.length - 1;
        while(i>=0&&j>=0) {
            if(a[i]==b[j]){
                sb.append(a[i]);
            }
            int tmpI=dp[i][j].x;
            int tmpJ=dp[i][j].y;
            i = tmpI;
            j = tmpJ;
        }
        System.out.println(sb.reverse());
    }

    static class Node {
        public int len;
        public int x;
        public int y;
        public Node(int len, int x, int y) {
            this.len = len;
            this.x = x;
            this.y = y;
        }
    }

}