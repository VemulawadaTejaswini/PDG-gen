import java.util.*;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        boolean[][] b = new boolean[n][m];
        for(int i=0; i<n; i++) {
            char[] line = sc.next().toCharArray();
            for(int j=0; j<m; j++) {
                b[i][j] = line[j] == '#';
            }
        }

        int row[][] = new int[n][m];
        int col[][] = new int[n][m];

        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(j==0) {
                    if(!b[i][j]) {
                        row[i][0] = 1;
                    }
                    continue;
                }
                if(b[i][j]) {
                    continue;
                }
                row[i][j] = row[i][j-1]+1;
            }
            for(int j=m-2; j>=0; j--) {
                if(row[i][j] > 0 && row[i][j+1] > 0) {
                    row[i][j] = row[i][j+1];
                }
            }
        }
        for(int j=0; j<m; j++) {
            for(int i=0; i<n; i++) {
                if(i==0) {
                    if(!b[i][j]) {
                        col[0][j] = 1;
                    }
                    continue;
                }
                if(b[i][j]) {
                    continue;
                }
                col[i][j] = col[i-1][j]+1;
            }
            for(int i=n-2; i>=0; i--) {
                if(col[i][j] > 0 && col[i+1][j] > 0) {
                    col[i][j] = col[i+1][j];
                }
            }
        }


        int res = 0;
        for(int j=0; j<m; j++) {
            for (int i = 0; i < n; i++) {
                res = Math.max(res, row[i][j]+col[i][j]-1);
            }
        }

        System.out.println(res);


    }

}
