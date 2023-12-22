import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        long[] key = new long[N];
        Map<Long,Long> map =  new TreeMap<>();
        
        for(int i = 0; i < N; i++){
            key[i] = sc.nextLong();
            map.put(key[i],sc.nextLong());
        }
        Arrays.sort(key);
        
        long money = 0;
        for(int i = 0; i < N; i++){
            if(map.get(key[i]) < M){
                money += key[i] * map.get(key[i]);
                M -= map.get(key[i]);
            }else{
                money += key[i] * M;
                break;
            }
        }
        System.out.println(money);
    }
}
