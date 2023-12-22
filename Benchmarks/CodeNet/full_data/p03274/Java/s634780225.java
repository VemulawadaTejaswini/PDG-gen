import java.util.*;


public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int[] candles = new int[n];

        for(int i=0;i<n;i++) {
            candles[i] = scanner.nextInt();
        }


        long min = (long)Double.POSITIVE_INFINITY;
        for(int i=0;i<n-k+1;i++) {
            int first = 0;
            int a = i;
            int x = k;
            long sum = 0;
            while(x>0) {
                sum += Math.abs(first-candles[a]);
                first = candles[a];
                a++;
                x--;
            }
            if(sum<min){
                min = sum;
            }
        }
        System.out.println(min);
    }
}