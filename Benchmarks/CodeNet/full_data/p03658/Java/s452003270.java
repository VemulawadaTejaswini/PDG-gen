import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int ans = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for(int i=0; i<N; i++){
            list.add(sc.nextInt());
        }

        Collections.sort(list);

        for(int i=N-K; i<N; i++){
            ans += list.get(i);
        }
        System.out.println(ans);
    }
}