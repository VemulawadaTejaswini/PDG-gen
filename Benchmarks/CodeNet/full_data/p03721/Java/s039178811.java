
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[][] nums =  new int[n][2];

        for(int i = 0 ;i < n;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            nums[i][0] = a;
            nums[i][1] = b;
        }
        int j = 0;
        int answer = 0;
        for(int i = 0 ;i < n;i++){
            j += nums[i][1];
            answer = nums[i][0];
            if(j >= k){
              break;
            }
        }
        System.out.print(answer);
    }
}