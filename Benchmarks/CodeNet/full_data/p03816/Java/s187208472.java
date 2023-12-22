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
            if(!list.contains(A[i])){
                list.add(A[i]);
            }
        }
        int k = list.size();
        if(k%2==1){
            System.out.println(k);
        }
        else{
            System.out.println(k - 1);
        }
    }
}