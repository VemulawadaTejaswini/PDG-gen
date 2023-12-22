import java.util.*;

public class Main{
    private static void solve(int N, int H, int[][] ab){
        double count = 0;
        int result = 0;
        int countb = 0;
        int sum = 0;
        int sumb = 0;
        int maxa = ab[0][0];
        int[] b = new int[N];        

        for(int i = 0; i < N; i ++){
            sumb += ab[i][1];
        }
        for(int i = 1; i < N; i ++){
            if(ab[i][0] > maxa) maxa = ab[i][0];
        }
        for(int i = 0; i < N; i ++){
            b[i] = ab[i][1];
        }
        Arrays.sort(b);
        if(b[0] > maxa){
            if(sumb >= H){
                int i = N - 1;
                while(sum < H){
                    sum += b[i];
                    i --;
                    result ++;
                }
                System.out.print(result);
                return;
            }
            else{
                double cal = (double)(H - sumb) / maxa;
                count = N + Math.ceil(cal);
                result = (int)count;
                System.out.print(result);
                return;
            }
        }
        else{
            for(int i = N - 1; i > 0; -- i){
                if(b[i] > maxa){
                    sum += b[i];
                    countb ++;
                }
                else break;
            }
            double cala = (double)(H - sum) / maxa;
            count = countb + Math.ceil(cala);
            result = (int)count;
            System.out.print(result);            
            return;
        }       
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