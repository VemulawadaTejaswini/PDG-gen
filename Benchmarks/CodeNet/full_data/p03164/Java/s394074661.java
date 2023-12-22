
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt(), W = sc.nextInt();   //N_max = 100, v_max = 1000
        int[] w = new int[N];
        long[] v = new long[N];
        for(int i=0;i<N;i++){
            w[i] = sc.nextInt();
            v[i] = sc.nextLong();
        }
        int v_sum = (int)sumOfArrValue(v);
        long w_sum = sumOfArrValue(w);
        long[] minWeight = new long[v_sum+1];   //価値を超えるために必要な最小重量
        for(int i=0;i<v_sum+1;i++){
            minWeight[i] = w_sum;
        }
        for(int i=0;i<N;i++){
            for(int j=W;j<v_sum+1;j++){
                if(j + v[i] <= v_sum){
                    minWeight[j] = Math.min(minWeight[j], minWeight[j + (int)v[i]] - w[i]);
                }
                //System.out.print(minWeight[j] + ", ");
            }
            //System.out.println();
        }
        boolean flag = true;
        for(int i=W;i<v_sum+1;i++){
            if(minWeight[i] > W){
                System.out.println(i-1);
                flag = false;
                break;
            }
        }
        if(flag)
            System.out.println(v_sum);
    }

    private static int sumOfArrValue(int[] arr){
        int sum = 0;
        for(int i : arr){
            sum += i;
        }
        return sum;
    }

    private static long sumOfArrValue(long[] arr){
        long sum = 0;
        for(long l : arr){
            sum += l;
        }
        return sum;
    }
}
