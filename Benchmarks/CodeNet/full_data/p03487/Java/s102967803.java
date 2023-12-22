import java.io.*;
import java.util.*;

class Main {
    public void run() throws Exception {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < input; i++){
            int inputVal = sc.nextInt();
            map.put(inputVal, map.getOrDefault(inputVal, 0) + 1);
        }
        int count = 0;
        for (Integer key : map.keySet()){
            int val = map.get(key);
            if(Math.abs(key - val) < val){
                count += Math.abs(key - val);
            } else {
                count += val;
            }
        }
        System.out.println(count);
    }

    public static void main(String... args) throws Exception{
        new Main().run();
    }
}