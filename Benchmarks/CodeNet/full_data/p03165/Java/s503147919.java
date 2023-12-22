import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] a = scanner.nextLine().toCharArray();
        char[] b = scanner.nextLine().toCharArray();
        char[] newA = new char[a.length + 1];
        char[] newB = new char[b.length + 1];
        for (int i = 1; i < newA.length; i++) {
            newA[i] = a[i-1];
        }
        for (int i = 1; i < newB.length; i++) {
            newB[i] = b[i-1];
        }
        Node[][] dp= new Node[newA.length][newB.length];
        for (int i = 0; i < newA.length; i++) {
            dp[i][0] = new Node(0, -1, -1);
        }
        for (int i = 0; i < newB.length; i++) {
            dp[0][i] = new Node(0, -1, -1);
        }
        for (int i = 1; i < newA.length; i++) {
            for (int j = 1; j < newB.length; j++) {
                if(newA[i] == newB[j]) {
                    dp[i][j] = new Node(dp[i-1][j-1].len + 1, i-1, j-1);
                } else {
                    if(dp[i-1][j].len >= dp[i][j-1].len) {
                        dp[i][j] = new Node(dp[i-1][j].len, i-1,j);
                    } else {
                        dp[i][j] = new Node(dp[i][j-1].len, i,j-1);
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        int i =newA.length-1,j=newB.length-1;
        while(i>=0&&j>=0) {
           if(newA[i]==newB[j] && newA[i]!='\0') {
               sb.append(newA[i]);
           }
           int tmpI = dp[i][j].x;
           int tmpJ = dp[i][j].y;
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