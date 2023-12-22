import java.io.*;
import java.util.*;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] input = new int[n][3];
        for(int i = 0; i<n; i++){
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        input[i][0] = a;
        input[i][1] = b;
        input[i][2] = c;
        }
        int solve = dp(n, input);
        System.out.println(solve);
    }
    public static int dp(int n, int[][] input){
    int[][] arr = new int[n][3];
    int max = 0;
    for(int i = 0; i<3; i++){
    arr[0][i] = input[0][i];
    max = Math.max(arr[0][i], max);
    }
    if(n==1){return max;}
    for(int i = 1; i<n; i++){
    arr[i][0] = input[i][0] + Math.max(arr[i-1][1], arr[i-1][2]);
    arr[i][1] = input[i][1] + Math.max(arr[i-1][0], arr[i-1][2]);
    arr[i][2] = input[i][2] + Math.max(arr[i-1][0], arr[i-1][1]);
    }
    for(int i = 0; i<3; i++){
    max = Math.max(arr[n-1][i], max);
    }
    return max;
    }

}
