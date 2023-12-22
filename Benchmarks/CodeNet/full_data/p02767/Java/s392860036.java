import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int [n];
        int max = 0;
        int min = 101;
        for(int i = 0; i < n; i++){
            x[i] = sc.nextInt();
            if(max < x[i]){
                max = x[i];
            }
            if(min > x[i]){
                min = x[i];
            }
        }
        int res = Integer.MAX_VALUE;
        for(int i = min; i <= max; i++){
            int sum = 0;
            for(int j = 0; j < n; j++){
                sum += Math.pow(x[j] - i, 2);
            }
            if(res > sum){
                res = sum;
            }
        }
        System.out.println(res);
    }
}
