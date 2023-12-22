import java.util.*;

public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] a = new int[N];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < N; i++){
            a[i] = sc.nextInt();
            map.put(i+1, a[i]);
        }
        sc.close();

        long count = 0;
        for(Integer key: map.keySet()){
            if(key == map.get(map.get(key)))
                count++;
        }
        System.out.println(count/2);
   }
}