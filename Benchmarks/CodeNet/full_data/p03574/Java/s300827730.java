import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        char[][] board = new char[h][w];
        for(int i =0; i < h; i++) {
           String s = sc.next();
           for(int k =0; k < w; k++){
               char c = s.charAt(k);
               board[i][k] = c;
           }
        }
        for(int i =0; i < h; i++) {
            for (int k = 0; k < w; k++) {
                if(board[i][k]=='#'){
                    continue;
                }
                int result = 0;
                for(int y =i-1; y <= i+1; y++) {
                    for (int x = k -1; x <= k+1; x++) {
                        if(y < 0 || y >= h || x < 0 || x >= w) continue;
                        if(y == i && x == k) continue;

                        if(board[y][x]=='#'){
                            result++;
                        }
                    }
                }
                board[i][k] = Character.forDigit(result, 10);
            }
        }
        for(int i =0; i < h; i++) {
            for (int k = 0; k < w; k++) {
                System.out.print(board[i][k]);
            }
            System.out.println();
        }
    }
}