import java.util.*;
import java.util.Collections;
import java.util.ArrayList;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        if(N==1){
            System.out.println(1);
            return;
        }
        int[] A = new int[N];
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<N; i++){
            A[i] = sc.nextInt();
            list.add(A[i]);
        }
        Collections.sort(list);

        int x = 1;
        int ans = 0;
        for(int i=1; i<N; i++){
            if(list.get(i)==list.get(i-1)){
                x += 1;
            }
            else{
                if(x%2!=1){
                    ans += 1;
                }
                x = 1;
            }
            if(i==N-1){
                if(x%2!=1){
                    ans += 1;
                }
            }
        }
        System.out.println(ans);
    }
}