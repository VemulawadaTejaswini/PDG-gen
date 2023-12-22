import java.util.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int[] x = new int[N];
        int[] y = new int[M];
        for(int i = 0; i < N; i++){
            x[i] = sc.nextInt();
        }
        for(int i = 0; i < M; i++){
            y[i] = sc.nextInt();
        }
        String ans = "War";
        Arrays.sort(x);
        Arrays.sort(y);
        if(x[N-1] >= y[0]){
        }else{
            for(int i = x[N-1]; i <= y[0]; i++){
                if(i > X && i <= Y){
                    ans = "No War";
                }
            }
        }
        System.out.println(ans);
    }
}
