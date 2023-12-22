import java.util.*;
import java.util.Collections;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];
        int x = N / 2;
        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i=0; i<N; i++){
            A[i] = sc.nextInt();
            list.add(A[i]);
        }

        Collections.sort(list);

        if(N%2==0){
            for(int i=1; i<N; i=i+2){
                if(list.get(i-1)!=i || list.get(i)!=i){
                    System.out.println(0);
                    break;
                }
                if(i==N-1){
                    System.out.println((long)(Math.pow(2, x) % (Math.pow(10, 9) + 7)));
                }
            }
        }
        else{
            for(int i=2; i<N; i=i+2){
                if(list.get(i-1)!=i || list.get(i)!=i){
                    System.out.println(0);
                    break;
                }
                if(i==N-1){
                    System.out.println((long)(Math.pow(2, x) % (Math.pow(10, 9) + 7)));
                }
            }
        }
    }
}