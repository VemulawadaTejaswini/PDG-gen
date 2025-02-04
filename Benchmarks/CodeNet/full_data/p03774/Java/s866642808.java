import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int students[][] = new int[n][2];
        int points[][] = new int[m][2];
        
        for (int i = 0; i < n ; i++){
            students[i][0] = sc.nextInt(); 
            students[i][1] = sc.nextInt(); 
        }
        for (int i = 0; i < m ; i++){
            points[i][0] = sc.nextInt();
            points[i][1] = sc.nextInt();
        }
        for (int i = 0; i < n ; i++){
            int min_index = 0, min_val = 1000000000;
            for (int j = 0; j < m; j++){
                if (Math.abs(points[j][0] - students[i][0]) + Math.abs(points[j][1] - students[i][1]) < min_val){
                    min_val = Math.abs(points[j][0] - students[i][0]) + Math.abs(points[j][1] - students[i][1]);
                    min_index = j;
                }
            }
            System.out.println(min_index + 1);
        }
        
    }
}
