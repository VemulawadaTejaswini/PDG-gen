import java.util.*;

public class Main {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int[][] aField = new int[h + 1][w + 1];
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= w; j++) {
                aField[i][j] = sc.nextInt();
            }
        }
        int[][] bField = new int[h + 1][w + 1];
         for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= w; j++) {
               bField[i][j] = sc.nextInt();
            }
        }
        HashSet<Integer>[][] field = new HashSet[h + 1][w + 1];
        for (int i = 0; i <= h; i++) {
            field[i][0] = new HashSet<Integer>();
            field[i][0].add(0);
        }
        for (int j = 1; j <= w; j++) {
            field[0][j] = new HashSet<Integer>();
            field[0][j].add(0);
        }
        
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= w; j++) {
                field[i][j] = new HashSet<Integer>();
                int a = aField[i][j] - bField[i][j];
                for (int x : field[i - 1][j]) {
                    field[i][j].add(Math.abs(x + a));
                    field[i][j].add(Math.abs(x - a));
                }
                for (int x : field[i][j - 1]) {
                    field[i][j].add(Math.abs(x + a));
                    field[i][j].add(Math.abs(x - a));
                }
            }
        }
        int min = Integer.MAX_VALUE;
        for (int x : field[h][w]) {
            min = Math.min(x, min);
        }
        System.out.println(min);
    }
}
