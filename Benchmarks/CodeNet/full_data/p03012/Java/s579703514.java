import java.util.*;

class Main{
    public static void main(String argv[]) {
        Scanner sc = new Scanner(System.in);
        int N= sc.nextInt();
        int[] W = new int[N];
        for(int i=0;i<N;i++){
            W[i] = sc.nextInt();
        }

        int diff=100000;
        for(int i=1;i<N;i++){
            int sum1 = sum_array(W, 0, i);
            int sum2 = sum_array(W, i, N);
            if(Math.abs(sum1-sum2)<diff){
                diff=Math.abs(sum1-sum2);
            }
        }
        System.out.println(diff);

    }

    public static int sum_array(int[] array, int a, int b) {
        int result = 0;
        for(int i=a;i<b;i++){
            result += array[i];
        }
        return result;
    }
}