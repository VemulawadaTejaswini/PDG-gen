import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int d = input.nextInt();
        int[][] array = new int[n][d];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < d; j++) {
                array[i][j] = input.nextInt();
            }
        }
        int count = 0;
        double dis = 0;
        for (int i = 0; i < n-1; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = 0; k < d; k++) {
                    dis += Math.pow(array[i][k] - array[j][k],2);
                }
                dis = Math.sqrt(dis);
                if(dis == (int)dis){
                    count++;
                }
                dis = 0;
            }
        }
        System.out.println(count);
    }
}

