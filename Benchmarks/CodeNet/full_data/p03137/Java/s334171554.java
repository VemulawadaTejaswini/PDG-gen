import java.util.*;
import java.util.Collections;
import java.util.ArrayList;
 
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
 
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] X = new int[M];
        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i=0; i<M; i++){
            X[i] = sc.nextInt();
            list.add(X[i]);
        }

        Collections.sort(list);

        int[] L = new int[M - 1];
        ArrayList<Integer> al = new ArrayList<Integer>();

        for(int i=0; i<M-1; i++){
            L[i] = list.get(i + 1) - list.get(i);
            al.add(L[i]);
        }

        Collections.sort(al);
        int sum = 0;
        for(int i=M-2; i>M-2-N+1; i--){
            sum += al.get(i);
        }
        System.out.println(list.get(M - 1) - list.get(0) - sum);
    }
}