import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int K = scan.nextInt();

        int array[] = new int[num1];
        int dp[] = new int[num1];
        Arrays.fill(dp, 100010); 
        
        for(int i=0; i<num1; i++){
            int num2 = scan.nextInt();
            array[i] = num2;
        }
        
        dp[0] = 0;
        
        for(int i=1; i<num1; i++){
            for(int j = 1; j<K+1; j++){
                if(i-j > -1){
                    if(dp[i] > dp[i-j] + Math.abs(array[i] - array[i-j])){
                        dp[i] = dp[i-j] + Math.abs(array[i] - array[i-j]);
                    }
                }
            }
        }
        
        System.out.println(dp[num1 -1]);
    }
}