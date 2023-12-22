import java.util.*;

public class Main{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i = 0; i < N; i++){
            A[i] = sc.nextInt();
        }
        sc.close();
        long[] s = new long[N];
        s[0] = A[0];
        for(int i = 1; i < N; i++){
            s[i] = s[i-1] + A[i];
        }
        Map<Long, Integer> map = new HashMap<>();

        long count = 0;

        for(int i = 0; i < N; i++){
            if(map.containsKey(s[i]))
                map.put(s[i], map.get(s[i])+1);
            else
                map.put(s[i], 1);
        }

        for(int i = 0; i < N; i++){
            if(s[i] == 0)
                count++;
        }
        for(Long key: map.keySet()){
            long v = map.get(key);
            if(v >= 2){
                count+= v*(v-1)/2;
            }
        }

        System.out.println(count);
    }
}