import java.util.*;
import java.io.*;
public class Main {
    public static int solve(int arr[][] , int n){
        if(arr.length == 1){
            return arr[0][0];
        }
        
        int ans = 0;
        for(int i = 0 ; i < n ; i++){
            if(arr[i][0] == 1){
                int arr1[][] = new int[n-1][n-1];
                for(int j = 0, l = 0; j < n ; j++ , l++){
                    if(j == i) {
                        l--;
                        continue;
                    }
                    for(int k = 1 , m = 0 ; k < n ; k++ , m++){
                        arr1[l][m] = arr[j][k];
                    }
                    ans += solve(arr1 , n-1);
                }
            }
        }
        return ans;
    }
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[][] = new int[n][n];
        for(int i = 0; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                arr[i][j] = s.nextInt();
            }
        }
        System.out.println(solve(arr , n));
    }
}