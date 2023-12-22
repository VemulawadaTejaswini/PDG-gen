import javax.swing.*;
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[][] arr = new int[count][3];
        int[][] values = new int[count][3];
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
                values[i][j] = 0;
            }
        }
        values[0] = arr[0];
        for (int i = 1; i < count; i++) {
            values[i][0] = arr[i][0] + Math.max(values[i - 1][1], values[i - 1][2]);
            values[i][1] = arr[i][1] + Math.max(values[i - 1][0], values[i - 1][2]);
            values[i][2] = arr[i][2] + Math.max(values[i - 1][0], values[i - 1][1]);
        }
        

        
        System.out.println(Math.max(Math.max(values[count - 1][0], values[count - 1][1]),values[count - 1][2]));
    }
}