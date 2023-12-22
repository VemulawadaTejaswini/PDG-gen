import java.util.Scanner;

public final class Main{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        for(int i=0; i<n; i++){
            x[i] = stdIn.nextInt();
            y[i] = stdIn.nextInt();
        }

        int a = fact(n-2) * 2;
        int b = 2 * fact(n-2);
        int c = fact(n-1) * 2 - (a + b);

        double lSum = 0;
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                lSum += Math.sqrt((x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]));
            }
        }

        if(n == 2){
            System.out.println((a) *lSum / fact(n));
        }else{
            System.out.println((a + b + c) * lSum / fact(n));
        }
    }

    private static int fact(int n){
        int ans = 1;
        for(int i=n; i>=1; i--){
            ans *= i;
        }
        return ans;
    }
}
