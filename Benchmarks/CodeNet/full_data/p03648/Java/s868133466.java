import java.util.*;

/**
 * Created by mizuk on 2017/07/26.
 */
public class Main {
    private static final int N = 50;
    private static int K;
    private static int a[] = new int[N];

    public static void input(){
        Scanner scan = new Scanner(System.in);
        K = scan.nextInt();
    }

    public static void main(String args[]){
        //入力
        input();

        for (int i=0;i<N;i++){
            a[i] = i;
        }

        int quotient = K / N;
        int remainder = K % N;

        for (int i=0;i<N;i++){
            a[i] += quotient;
        }

        for (int i=0;i<remainder;i++){
            a[i] = a[i] + N - (remainder - 1);   //ひかれる数が一回少ない
        }
        for (int i=remainder;i<N;i++){
            a[i] -= remainder;
        }

        System.out.println(N);
        for (int i=0;i<N;i++){
            System.out.print(a[i] + " ");
        }

    }
}