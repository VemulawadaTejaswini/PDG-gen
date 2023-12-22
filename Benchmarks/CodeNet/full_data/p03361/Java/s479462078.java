import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static  void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int w = scanner.nextInt();
        String x[][] = new String[h + 2][w + 2];
        for(int i = 0; i < x.length; i++){
            Arrays.fill(x[i], ".");
        }
        for (int i = 1; i < h + 1; i++) {
            String str = scanner.next();
            for (int j = 1; j < w + 1; j++) {
                x[i][j] = str.substring(j - 1, j);
                //System.out.print(x[i][j]);
            }
            //System.out.println();
        }

        boolean ans = true;
        for (int i = 1; i < h + 1; i++) {
            for (int j = 1; j < w + 1; j++) {
                if (x[i][j].equals("#") && !(x[i-1][j].equals("#")) && !(x[i+1][j].equals("#")) && !(x[i][j-1].equals("#")) && !(x[i][j+1].equals("#"))) {
                    System.out.println("No");
                    ans = false;
                    return;
                }
            }
        }
        if(ans){
            System.out.println("Yes");
        }
    }
}
