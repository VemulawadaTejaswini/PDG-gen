import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] hoge = sc.nextLine().split(" ");
        int line = Integer.parseInt(hoge[0]);
        int row = Integer.parseInt(hoge[1]);
        int[][] maze = new int[line][row];
        int result =0;
        for(int l=0;l<line;l++){
            char[] hoja = sc.nextLine().toCharArray();
            for(int r=0;r<row;r++){
                if(hoja[r]=='.'){
                    maze[l][r]=0;
                }else{
                    maze[l][r]=-1;
                }
            }
        }
        for(int l=0;l<line;l++){
            for(int r=0;r<row;r++){
                    int c = calc(maze,l,r,line,row);
                    if(result<c)result=c;
            }
        }
        System.out.println(result);
    }
    private static int calc(int[][] arg,int x,int y,int line,int row){
        int[][] maze = new int[line][row];
        for(int l=0;l<line;l++){
            for(int r=0;r<row;r++){
                maze[l][r]=arg[l][r];
            }
        }
        maze[x][y]=1;
        int result = 1;
        for(int i=2;i<=line*row;i++) {
            for (int l = 0; l < line; l++) {
                for (int r = 0; r < row; r++) {
                    if(maze[l][r]==0) {
                        if (l > 0 && maze[l - 1][r] == i - 1) {
                            maze[l][r] = i;
                            result = i;
                        }
                        if (l < line - 1 && maze[l + 1][r] == i - 1) {
                            maze[l][r] = i;
                            result = i;
                        }
                        if (r > 0 && maze[l][r - 1] == i - 1) {
                            maze[l][r] = i;
                            result = i;
                        }
                        if (r < row - 1 && maze[l][r + 1] == i - 1) {
                            maze[l][r] = i;
                            result = i;
                        }
                    }
                }
            }
        }

        return  result-1;
    }
}