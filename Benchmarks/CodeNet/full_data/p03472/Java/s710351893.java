import java.util.*;

public class Main{
    private static void solve(int N, int H, int[][] ab){
        int count = 0;
        int sum = 0;
        int maxa = ab[0][0];
        int[] b = new int[N];        
        for(int i = 1; i < N; i ++){
            if(ab[i][0] > maxa) maxa = ab[i][0];
        }
        for(int i = 0; i < N; i ++){
            b[i] = ab[i][1];
        }
        Arrays.sort(b);
        for(int i = N - 1; b[i] > maxa && i > 0; i --){
            sum += b[i];
            count ++;
        }
        if(b[0] > maxa){
            sum += b[0];
            count ++;
        }
        count = (int)(count + Math.ceil((double)(H - sum) /maxa));
        System.out.print(count);            
        return;    
    }
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int H = input.nextInt();
        int[][] ab = new int[N][2];
        for(int i = 0; i < N; i ++){
            for(int j = 0; j < 2; j ++){
                ab[i][j] = input.nextInt();
            }
        }
        input.close();
        solve(N, H, ab);
    }
}