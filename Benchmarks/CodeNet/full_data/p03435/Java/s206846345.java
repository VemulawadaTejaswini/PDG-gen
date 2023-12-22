import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int board[][] = new int[3][3];
        for (int y = 0;y < 3;++y){
            for (int x = 0;x < 3;++x){
                board[x][y] = sc.nextInt();
            }
        }
        if(search(board)){
            System.out.println("Yes");
        }
        else System.out.println("No");
    }

    public static boolean search(int board[][]){
        int k = 0;
        for (int j = 1;j <= 2;++j){
            for (int i = 0;i < 3;++i){
                if(i == 0){
                    k = board[0][j] - board[0][0];
                }
                else{
                    if(k != board[i][j] - board[i][0]){
                        return false;
                    }
                }
            }
        }
        for (int j = 1;j <= 2;++j){
            for (int i = 0;i < 3;++i){
                if(i == 0){
                    k = board[j][0] - board[0][0];
                }
                else{
                    if(k != board[j][i] - board[0][i]){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}