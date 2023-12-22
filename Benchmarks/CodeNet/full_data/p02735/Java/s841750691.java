import java.util.*;
import java.util.function.*;
import java.lang.*;
import java.io.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();

        char[][] board = new char[H][W];
        for(int h=0; h<H; h++){
            String line = sc.next();
            for(int w=0; w<W; w++) board[h][w] = line.charAt(w);
        }

        int[][] shortest = new int[H][W];
        for(int h=0; h<H; h++) for(int w=0; w<W; w++) shortest[h][w]=1000000;
        shortest[0][0] = 0;
        for(int h=1; h<H; h++){
            if(board[h-1][0]==board[h][0]) shortest[h][0] = shortest[h-1][0];
            else shortest[h][0] = 1 + shortest[h-1][0];
        }
        for(int w=1; w<W; w++){
            if(board[0][w-1]==board[0][w]) shortest[0][w] = shortest[0][w-1];
            else shortest[0][w] = shortest[0][w-1];
        }
        for(int h=1; h<H; h++) for(int w=1; w<W; w++){
            int d = board[h-1][w]==board[h][w] ? shortest[h-1][w] : 1+shortest[h-1][w];
            int r = board[h][w-1]==board[h][w] ? shortest[h][w-1] : 1+shortest[h][w-1];
            shortest[h][w] = Math.min(d,r);
        }
        System.out.println(shortest[H-1][W-1]);
    }
}
