import java.util.*;
import java.lang.*;


public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] P = new int[N];
        for(int n=0; n<N; n++) P[n]=sc.nextInt();

        TreeMap<Integer,Integer> valueToIndex = new TreeMap<>();
        for(int n=0; n<N; n++) valueToIndex.put(P[n], n);

        Integer[] largerLeft1 = new Integer[N];
        Integer[] largerLeft2 = new Integer[N];
        Integer[] largerRight1 = new Integer[N];
        Integer[] largerRight2 = new Integer[N];


        TreeMap<Integer,Integer> indexToValue = new TreeMap<>();
        for(int v=N; v>0; v--){
            int i = valueToIndex.get(v);
            indexToValue.put(i,v);
            largerLeft1[i]  = indexToValue.lowerKey(i);
            if(largerLeft1[i]!=null) largerLeft2[i]  = indexToValue.lowerKey(largerLeft1[i]);
            largerRight1[i] = indexToValue.higherKey(i);
            if(largerRight1[i]!=null) largerRight2[i] = indexToValue.higherKey(largerRight1[i]);
        }

        long ans = 0;
        for(int i=0; i<N; i++){
            if(largerLeft1[i]!=null){
                if(largerLeft2[i]==null)largerLeft2[i] = -1;
                if(largerRight1[i]==null)largerRight1[i] = N;
                ans += 1L * (largerLeft1[i]-largerLeft2[i]) * (largerRight1[i] - i) * P[i];
            }
            if(largerRight1[i]!=null){
                if(largerRight2[i]==null) largerRight2[i] = N;
                if(largerLeft1[i]==null) largerLeft1[i] = -1;
                ans += 1L * (largerRight2[i]-largerRight1[i]) * (i - largerLeft1[i]) * P[i];
            }
        }
        System.out.println(ans);
    }
}
