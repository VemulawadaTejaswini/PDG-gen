import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int inp_num = sc.nextInt();
        int[] history = new int[inp_num];
        HashMap<Integer,Integer> counter = new HashMap<>();
        for(int i = 0;i < inp_num; i++){
            int num = sc.nextInt();
            history[i] = num;
            if(counter.containsKey(num)){
                counter.put(num,counter.get(num)+1);
            }else{
                counter.put(num, 1);
            }
        }
        long total = 0;
        for(Entry<Integer,Integer> key_value :counter.entrySet()){
            total += (key_value.getValue()*(key_value.getValue()-1))/2;
        }
        for(int num: history){
            System.out.println(total-(counter.get(num)-1));
        }
    }
}