import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int h = Integer.parseInt(sc.next());
        int w = Integer.parseInt(sc.next());
        char[][] matrix = new char[h][w];
        int sum = h*w;
        for(int i=0;i<h;i++){
            matrix[i] = sc.next().toCharArray();
            for(int j=0;j<w;j++){
                if(matrix[i][j] == '#'){
                    sum--;
                }
            }
        }
        sc.close();
        int count=0;
        int[] dx = {-1,0,1,0}; int[] dy = {0,-1,0,1};
        char[][] next_matrix = new char[h][w];
        for(int i=0;i<h;i++){
            System.arraycopy(matrix[i], 0, next_matrix[i], 0, w);
        }
        while(sum>0){
            for(int i=0;i<h;i++){
                for(int j=0;j<w;j++){
                    if(matrix[i][j]=='.'){
                        continue;
                    }
                    for(int k=0;k<4;k++){
                        int ni = i + dy[k]; int nj = j + dx[k];
                        if(ni<0 || ni>=h || nj<0 || nj>=w || next_matrix[ni][nj] == '#'){
                            continue;
                        }
                        next_matrix[ni][nj] = '#';
                        sum--;
                    }
                }
            }
            for(int i=0;i<h;i++){
                System.arraycopy(next_matrix[i], 0, matrix[i], 0, w);
            }
            count++;
        }
        System.out.println(count);
    }
}