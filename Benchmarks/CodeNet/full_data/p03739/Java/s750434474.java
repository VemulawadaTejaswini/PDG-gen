import java.util.Scanner;
import java.util.Arrays;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int [n];
        for(int i = 0;i < n;i++){
            a[i] = sc.nextInt();
        }
        int[] sum = new int[n];
        sum[0] = a[0];
        int count = 0;
        if(sum[0] == 0){
            count++;
        }
        count = solve(sum,a,count);
        System.out.println(count);
    }
    public static int solve(int[] sum,int[] a,int count){
        for(int i = 0;i < sum.length-1;i++){
            sum[i+1] = sum[i] + a[i+1];
            if(sum[0] > 0){
                if((i+1) % 2 == 1){
                    while(sum[i+1] >= 0){
                        sum[i+1]--;
                        count++;
                    }
                }
                if((i+1) % 2 == 0){
                    while(sum[i+1] <= 0){
                        sum[i+1]++;
                        count++;
                    }
                }
            }
            if(sum[0] < 0){
                if((i+1) % 2 == 1){
                    while(sum[i+1] <= 0){
                        sum[i+1]++;
                        count++;
                    }
                }
                if((i+1) % 2 == 0){
                    while(sum[i+1] >= 0){
                        sum[i+1]--;
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
