import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int w = sc.nextInt();
        int[][] field = new int[h][w];

        for(int i = 0; i < h; i++){
            for(int j = 0; j < w; j++){
                field[i][j] = sc.nextInt();
            }
        }

        StringBuilder sb = new StringBuilder();
        int n = 0;

        for(int y = 0; y < h; y++){
            for(int x = 0; x < w - 1; x++){
                if(field[y][x] % 2 == 1){
                    field[y][x]--;
                    field[y][x + 1]++;
                    n++;
                    sb.append(y).append(" ").append(x).append(" ")
                      .append(y).append(" ").append(x + 1).append(" ").append("\n");
                }
            }
            if(y < h - 1 && field[y][w - 1] % 2 == 1){
                field[y][w - 1]--;
                field[y + 1][w - 1]++;
                n++;
                sb.append(y).append(" ").append(w - 1).append(" ")
                  .append(y + 1).append(" ").append(w - 1).append(" ").append("\n");
            }

        }

        System.out.print(sb.insert(0, "\n").insert(0, n).toString());

        /*
        for(int i = 0; i < h; i++){
            for(int j = 0; j < w; j++){
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
        
         */
    }
}
