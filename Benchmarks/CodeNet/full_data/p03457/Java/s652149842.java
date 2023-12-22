import java.util.*;

public class Main{
    static public void main(String[] argc){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] t = new int[N+1];
        int[] x = new int[N+1];
        int[] y = new int[N+1];

        t[0] = 0; x[0] = 0; y[0] = 0;
        for(int i=1;i<=N;i++){
            t[i] = sc.nextInt();
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        for(int i=0;i<N;i++){
            int dist = Math.abs(x[i] - x[i+1]) + Math.abs(y[i] - y[i+1]);
            int intv = t[i+1] - t[i];

            if(dist > intv || (dist%2) != (intv%2)){
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
        return;
    }
}