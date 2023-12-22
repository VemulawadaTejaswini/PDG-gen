import java.util.*;
 
public class Main{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        Map<Integer, Integer> map = new TreeMap<>();
        int[][] a = new int[2][N];
        for(int i = 0; i < N; i++){
            a[0][i] = sc.nextInt();
            a[1][i] = sc.nextInt();
            if(map.containsKey(a[0][i]))
                map.put(a[0][i], map.get(a[0][i]) + a[1][i]);
            else
                map.put(a[0][i], a[1][i]);
        }
        sc.close();
        
        int sum = 0;
        for(Integer key: map.keySet()){
            sum += map.get(key);
            if(sum >= K){
                System.out.println(key);
                return;
            }
        }
    }
}