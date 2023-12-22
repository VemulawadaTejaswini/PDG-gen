
import java.awt.Dimension;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        HashMap<Integer, Dimension> map = new HashMap<>();
        int H = s.nextInt(), W = s.nextInt(), D = s.nextInt();
        for(int i = 0; i < H; i++){
            for(int j = 0; j < W; j++){
                map.put(s.nextInt(), new Dimension(i+1, j+1));
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
                Dimension p1 = map.get(now), p2 = map.get(now + D);
                pow += Math.abs(p2.height - p1.height) + Math.abs(p2.width - p1.width);
                now += D;
            }
            System.out.println(pow);
        }
    }
}
