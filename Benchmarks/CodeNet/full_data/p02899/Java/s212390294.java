import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++){
            int temp = sc.nextInt();
            map.put(temp,i+1);
        }

        Object[] mapkey = map.keySet().toArray();
        Arrays.sort(mapkey);

        for(Integer key : map.keySet()){
            System.out.print(map.get(key)+" ");
        }



    }
}
