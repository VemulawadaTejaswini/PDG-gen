import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] x = new int[N+1];
        int[] dif = new int[N];
        int max = 0;
        int r, tmp;
        for(int i = 0; i < N+1; i++){
            x[i] = sc.nextInt();
        }
        for(int i = 0; i < N; i++){
            dif[i] = Math.abs(x[i+1] - x[i]);
        }
        for(int i = 0; i < N-1; i++){
            if(dif[i] < dif[i+1]){
                tmp = dif[i];
                dif[i] = dif[i+1];
                dif[i+1] = tmp;
            }
            while( (r = dif[i] % dif[i+1]) != 0 ) {
                dif[i] = dif[i+1];
                dif[i+1] = r;
            }
        }
        System.out.println(dif[N-1]);
    }
}
