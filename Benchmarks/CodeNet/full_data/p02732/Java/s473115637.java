import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ball = new int[n];
        Map<Integer, Integer> map = new HashMap();
        for (int i = 0; i < n; i++) {
            ball[i] = sc.nextInt();
            if(map.containsKey(ball[i])){
                int b = map.get(ball[i]) + 1;
                map.replace(ball[i], b);
            }else{
                map.put(ball[i], 1);
            }
        }
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for(int k: map.keySet()){
                int v = map.get(k);
                if(k == ball[i]){
                    v --;
                }
                if(v > 1){
                    sum += v * (v - 1) / 2;
                }
            }
            System.out.println(sum);
        }
    }
}
