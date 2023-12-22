import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int[][] matrix = new int[H+2][W+2];
        boolean[][] record = new boolean[H+2][W+2];
        for(int j=0;j<=W+1;j++) matrix[0][j] = 0;
        for(int row = 1;row<=H;row++){
            matrix[row][0]=0;
            for(int col=1;col<=W;col++){
                String cur = sc.next();
                if(cur.equals("#")) matrix[row][col]=1;
                else matrix[row][col]=0;
            }
            matrix[row][W+1]=0;
        }
        for(int j=0;j<=W+1;j++) matrix[H+1][j] = 0;
        for(int row=1;row<=H;row++){
            for(int col=1;col<=W;col++){
                if(matrix[row][col]==0) continue;
                int cur = matrix[row][col-1]|matrix[row][col+1]|matrix[row-1][col]|matrix[row+1][col];
                if(cur==0){
                    System.out.println("No");
                    System.exit(0);
                }
            }
        }
        System.out.println("Yes");

    }
}