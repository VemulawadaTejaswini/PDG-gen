import java.util.*;
 
public class Main {
    static char[][] tempGrid;
    static boolean[][] hasVisited;
    static int answer;
    
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt(); //行
        int M = scan.nextInt(); //列
        int Q = scan.nextInt(); //質問の数
        char[][] grid = new char[N][M];
        
        for(int i = 0; i < N; i++) {
            String S = scan.next();
            for(int j = 0; j < M; j++) {
                grid[i][j] = S.charAt(j);
            }
        }
        
        hasVisited = new boolean[N][M];
        tempGrid = new char[N][M];
        
        for(int i = 0; i < Q; i++) {
            int x1 = scan.nextInt();
            int y1 = scan.nextInt();
            int x2 = scan.nextInt();
            int y2 = scan.nextInt();
            answer = 0;
            clearHasVisited(N, M);
            
            for(int j = 0; j < x2-x1+1; j++) {
                for(int k = 0; k < y2-y1+1; k++) {
                    tempGrid[j][k] = grid[j+x1-1][k+y1-1];
                }
            }
            
            countAnswer(x1, y1, x2, y2);
            System.out.println(answer);
        }
    }
    
    static void clearHasVisited(int N, int M) {
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                hasVisited[i][j] = false;
            }
        }
    }
    
    static void countAnswer(int x1, int y1, int x2, int y2) {
        for(int i = 0; i < x2-x1+1; i++) {
            for(int j = 0; j < y2-y1+1; j++) {
                if(tempGrid[i][j] == '1' && !hasVisited[i][j]) {
                    answer++;
                    searchGrid(i, j, x1, y1, x2, y2);
                }
            }
        }
    }
    
    static void searchGrid(int i, int j, int x1, int y1, int x2, int y2) {
        //右探索
        if(j != y2-y1) {
            if(tempGrid[i][j+1] == '1' && !hasVisited[i][j+1]) {
                hasVisited[i][j+1] = true;
                searchGrid(i, (j+1), x1, y1, x2, y2);
            }
        }
        //下探索
        if(i != x2-x1) {
            if(tempGrid[i+1][j] == '1' && !hasVisited[i+1][j]) {
                hasVisited[i+1][j] = true;
                searchGrid((i+1), j, x1, y1, x2, y2);
            }
        }
        //左探索
        if(j != 0) {
            if(tempGrid[i][j-1] == '1' && !hasVisited[i][j-1]) {
                hasVisited[i][j-1] = true;
                searchGrid(i, (j-1), x1, y1, x2, y2);
            }
        }
        //上探索
        if(i != 0) {
            if(tempGrid[i-1][j] == '1' && !hasVisited[i-1][j]) {
                hasVisited[i-1][j] = true;
                searchGrid((i-1), j, x1, y1, x2, y2);
            }
        }
    }
}