import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];
        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i=0; i<N; i++){
            A[i] = sc.nextInt();
            list.add(A[i] - i - 1);
        }

        Collections.sort(list);
        long ans = 0; 
        int b = 0;
        if(N%2!=0){
            b = list.get(N / 2);
        }
        else{
            b = (list.get(N / 2) + list.get(N / 2 - 1)) / 2;
        }
        for(int i=0; i<N; i++){
            ans += Math.abs(A[i] - (b + i + 1));
        }
        System.out.println(ans);
    }
}