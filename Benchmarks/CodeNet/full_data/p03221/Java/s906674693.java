//なにげないArrays.sortが、k.otubakを傷つけた

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int M = s.nextInt();
        int id[][] = new int[4][M];
        final int I = 0, P = 1, Y = 2, X = 3; 
        for(int i = 0; i < M; i++){
            id[I][i] = i;
            id[P][i] = s.nextInt();
            id[Y][i] = s.nextInt();
            id[X][i] = 1;
        }
        sort(id, Y, M);
        
        for(int i = 1; i < M; i++){
            for(int j = i - 1; j >= 0; j--){
                if(id[P][i] == id[P][j]){
                    id[X][i] = id[X][j] + 1;
                    break;
                }
            }
        }
        sort(id, I, M);
        
        for(int i = 0; i < M; i++)
            System.out.println(String.format("%06d%06d", id[P][i], id[X][i]));
    }
    
    private static void sort(int id[][], int index, int length){
        int temp;
        for(int i = 0; i < length - 1; i++){
            for(int j = length - 1; i < j; j--){
                if(id[index][j-1] > id[index][j]){
                    for(int k = 0; k < 4; k++){
                        temp = id[k][j];
                        id[k][j] = id[k][j-1];
                        id[k][j-1] = temp;
                    }
                }
            }
        }
    }
}
