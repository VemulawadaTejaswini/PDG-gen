
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int H = s.nextInt(), W = s.nextInt(), D = s.nextInt();
        int x[] = new int[H*W], y[] = new int[H*W];
        for(int i = 0; i < H; i++){
            for(int j = 0; j < W; j++){
                int num = s.nextInt() - 1;
                x[num] = i + 1;
                y[num] = j + 1;
            }
        }
        int Q = s.nextInt();
        int L[] = new int[Q], R[] = new int[Q];
        for(int i = 0; i < Q; i++){
            L[i] = s.nextInt();
            R[i] = s.nextInt();
        }
        for(int i = 0; i < Q; i++){
            int pow = 0;
            int now = L[i];
            while(now != R[i]){
                pow += Math.abs(x[now + D - 1] - x[now - 1]) + Math.abs(y[now + D - 1] - y[now - 1]);
                now += D;
            }
            System.out.println(pow);
        }
        
    }
}
