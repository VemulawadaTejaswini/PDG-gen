import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static int count = 0;
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int w = scanner.nextInt();
        boolean[][] array = new boolean[h][w];

        boolean flag = false;
        for(int i = 0; i < h; i++) {
            String[] tmp = scanner.next().split("");
            for(int j = 0; j < tmp.length; j++) {
                array[i][j] = tmp[j].equals("#") ? true : false;
                if(array[i][j] && !flag) flag = true; 
            }
        }

        if(!flag) {
            System.out.print(0);
            return;
        } else {
            check(array, h, w);
            System.out.print(count+1);
        }
    }

    private static boolean check(boolean[][] array, int h, int w) {
        count++;
        boolean flag = true;

        for(int i = 0; i < h; i++) {
            for(int j = 0; j < w; j++) {
                if(array[i][j]) {
                    continue;
                }
                if(j+1 <= j && array[i][j+1]) {
                    flag = false;
                    array[i][j] = true;
                }
                if(i+1 <= i && array[i+1][j]) {
                    flag = false;
                    array[i][j] = true;
                }
            }
        }

        if(!array[h-1][w-1] && (array[h-2][w-1] || array[h-1][w-2])) {
            flag = false;
            array[h-1][w-1] = true;
        }

        if(!flag) {
            check(array, h, w);
        }
        
        return flag;
    }
}