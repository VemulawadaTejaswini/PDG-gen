import java.util.*;
import java.util.ArrayList;
import java.util.Collection;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] H = new int[N];
        int[] h = new int[N];
        long ans = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i=0; i<N; i++){
            H[i] = sc.nextInt();
            list.add(H[i]);
        }
        Collections.sort(list);
        for(int i=0; i<N; i++){
            h[i] = list.get(i);
        }
        for(int i=0; i<N-K; i++){
            ans = ans + h[i];
        }
        System.out.println(ans);
    }
}