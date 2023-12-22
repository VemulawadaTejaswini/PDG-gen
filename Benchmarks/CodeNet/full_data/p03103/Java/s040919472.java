import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        int n = sn.nextInt();
        int m = sn.nextInt();
        
        Map<Integer, Integer> shops = new HashMap<>();
        for (int i = 1; i <= n; i++){
            shops.put(sn.nextInt(), sn.nextInt());
        }
        List<Integer> keyList = shops.keySet().stream().sorted().collect(Collectors.toList());
        long sum = 0;
        for(int key : keyList){
            if(m < shops.get(key)){
                sum += key * m;
            } else {
                sum += key * shops.get(key);
            }
            
            m -= shops.get(key);
            if(m < 0){
                break;
            }
        }
        System.out.println(sum);
    }
}