import java.util.*;
 
public class Main{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < N; i++){
            int N = sc.nextInt();
            if(map.containsKey(N))
                map.put(N, map.get(N)+1);
            else
                map.put(N, 1);
                sc.close();
        }
        int count = 0;
        for(Integer key: map.keySet()){
            if(map.get(key) % 2 == 1)
                count++;
        }

        System.out.println(count);
    }
}