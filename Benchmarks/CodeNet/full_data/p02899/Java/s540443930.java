import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        Map<Long,Long> map = new HashMap<Long,Long>();
        for(long i=0;i<n;i++){
            long temp = sc.nextLong();
            map.put(temp,i+1);
        }

        Object[] mapkey = map.keySet().toArray();
        Arrays.sort(mapkey);

        for(Long key : map.keySet()){
            System.out.print(map.get(key)+" ");
        }



    }
}