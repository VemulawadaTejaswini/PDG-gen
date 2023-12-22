import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int Z = sc.nextInt();
        int K = sc.nextInt();
        long[] A = new long[X];
        long[] B = new long[Y];
        long[] C = new long[Z];

        for(int i=0; i<X; i++){
            A[i] = sc.nextLong();
        }
        for(int i=0; i<Y; i++){
            B[i] = sc.nextLong();
        }
        for(int i=0; i<Z; i++){
            C[i] = sc.nextLong();
        }

        ArrayList<Long> listab = new ArrayList<Long>();
        for(int i=0; i<X; i++){
            for(int j=0; j<Y; j++){
                listab.add(A[i] + B[j]);
            }
        }
        Collections.sort(listab, Collections.reverseOrder());
        ArrayList<Long> list = new ArrayList<Long>();
        for(int i=0; i<Math.min(K, listab.size()); i++){
            for(int j=0; j<Z; j++){
                list.add(listab.get(i) + C[j]);
            }
        }
        Collections.sort(list, Collections.reverseOrder());

        for(int i=0; i<K; i++){
            System.out.println(list.get(i));
        }
    }
}