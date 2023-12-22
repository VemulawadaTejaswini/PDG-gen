import java.util.*;

/**
 * Created by mizuk on 2017/07/26.
 */
public class Main {
    private static int N;
    private static long K;
    private static long a[];

    public static void input(){
        Scanner scan = new Scanner(System.in);
        N = scan.nextInt();

        a = new long[N];

        for (int i=0;i<N;i++){
            a[i] = scan.nextLong();
        }
    }
    
    public static int search_max(){
        long max = 0;
        int max_index = 0;
        
        for(int i=0;i<N;i++){
            if(max < a[i]){
                max = a[i];
                max_index = i;
            }
        }
        
        if(max < N) return -1;
        else {
            for (int i=0;i<max_index;i++) a[i]++;
            a[max_index] -= N;
            if(max_index != N-1)
                for (int i=max_index+1;i<N;i++) a[i]++;
        }
        
        return max_index;
    }

    public static void main(String args[]){
        //入力
        input();

        long count = 0;
        while (search_max() != -1){
            count++;
        }
        System.out.println(count);
    }
}