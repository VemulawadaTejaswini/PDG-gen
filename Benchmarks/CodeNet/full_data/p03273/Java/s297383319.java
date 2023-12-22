import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int mum = sc.nextInt();
        String[] input = new String[num];
        String[][] str = new String[num][mum];
        String[][] transpose = new String[mum][num];
        boolean[] row = new boolean[num];
        boolean[] line = new boolean[mum];
        for (int i = 0 ; i < num ; i++){
            input[i] = sc.next();
            for (int j = 0 ; j < mum ; j++){
                str[i][j] = String.valueOf(input[i].charAt(j));    
                if(String.valueOf(str[i][j]).equals("#")){
                row[i]=true;    
                }
            }
        }
        for(int i = 0; i < num; i++) {
            for (int j = 0; j < mum; j++) {
                transpose[j][i] = str[i][j];
            }
        }
        for (int i = 0 ; i < mum ; i++){
            for (int j = 0 ; j < num ; j++){
                if(String.valueOf(transpose[i][j]).equals("#")){
                line[i]=true;    
                }
            }
        }
         for (int i = 0 ; i < num ; i++){
             if(row[i]){
                 for (int j = 0 ; j < mum ; j++){
                     if(line[j]){
                         System.out.print(String.valueOf(str[i][j]));    
                     }
                 }
                 System.out.println();
             }
         }
    }
}