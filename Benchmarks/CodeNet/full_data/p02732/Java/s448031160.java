import java.util.*;
import java.util.Collections;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];
        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i=0; i<N; i++){
            A[i] = sc.nextInt();
            list.add(A[i]);
        }

        Collections.sort(list);

        int x = 1;
        int[] y = new int[N + 1];
        int ans = 0;
        int[] ansy = new int[N + 1];
        for(int i=1; i<N; i++){
            if(list.get(i)==list.get(i-1)){
                x += 1;
            }
            else{
                ans += x * (x - 1) / 2;
                y[list.get(i - 1)] = x;
                ansy[list.get(i - 1)] = x * (x - 1) / 2;
                x = 1;
            }
            if(i==N-1){
                ans += x * (x - 1) / 2;
                y[list.get(i)] = x;
                ansy[list.get(i)] = x * (x - 1) / 2;
            }
        }
        for(int i=0; i<N; i++){
            int a = ans;
            a -= y[A[i]] - 1;
            System.out.println(a);
        }
    }
}
