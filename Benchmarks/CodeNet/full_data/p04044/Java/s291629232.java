import java.util.*;

public class Main{
    static int[][] D;
    static int min = Integer.MAX_VALUE;
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int L = sc.nextInt();
        Map<String, Integer> map = new TreeMap<>();
        for(int i = 0; i < N; i++){
            map.put(sc.next(), 1);
        }
        sc.close();
        for(String key: map.keySet()){
            System.out.print(key);
        }
    }
}