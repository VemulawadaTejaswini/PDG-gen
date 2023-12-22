import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main {
    public static void main(String[] argv) {
        Scanner sc = new Scanner(System.in);


        String[] line = sc.nextLine().split(" ");


        int k = Integer.parseInt(line[1]);
        if(k == 1){
            System.out.println(0);
            return;
        }
        int n = Integer.parseInt(line[0]);
        
        int c = 0;
        int past = 0;
        HashMap<Integer, Integer> m = new HashMap<>();
        while(c < k){
            c++;
            n = Math.abs(n - k);
            if(m.containsKey(n)){
                if(c < m.get(n)){
                    m.put(n, c);
                }
            }else{
                m.put(n, c);
            }
        }

        int min = Integer.MAX_VALUE;
        int count_min = 0;
        for(Map.Entry<Integer, Integer> e: m.entrySet()) {
            if(e.getKey() < min) {
                min = e.getKey();
                count_min = e.getValue();
            }
        }
        System.out.println(min);
    }
}