import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        char board[][] = new char[H][W];
        int tmp[][] = new int[H][W];
        for(int i = 0; i < H; i++){
            String s = sc.next();
            for(int j = 0; j < s.length(); j++){
                board[i][j] = s.charAt(j);
            }
        }
        
        int result = 0;
        while(true){
            char tmpb[][] = new char[H][W];
            int cnt = 0;
            for(int i = 0; i < H; i++){
                for(int j = 0; j < W; j++){
                    if(board[i][j] == '.'){
                        cnt++;
                        tmpb[i][j] = '.';
                        if(i > 0){
                            if(board[i - 1][j] == '#'){
                                tmpb[i][j] = '#';
                            }
                        }
                        if(i < H - 1){
                            if(board[i + 1][j] == '#'){
                                tmpb[i][j] = '#';
                            }
                        }
                        if(j > 0){
                            if(board[i][j - 1] == '#'){
                                tmpb[i][j] = '#';
                            }
                        }
                        if(j < W - 1){
                            if(board[i][j + 1] == '#'){
                                tmpb[i][j] = '#';
                            }
                        }
                    }else{
                        tmpb[i][j] = '#';
                    }
                }
            }
            board = tmpb;
            if(cnt == 0){
                break;
            }
            result++;
        }
        System.out.println(result);
    }
}
