import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] cards = new int[n];
        for (int i = 0;i < n;++i){
            cards[i] = sc.nextInt();
        }
        Arrays.sort(cards);
        HashMap<Integer,Integer> counts = new HashMap<>();
        int c = 0;
        for (int i = 0;i < n;++i){
            if(counts.containsKey(cards[i])){
                counts.put(cards[i],counts.get(cards[i]) + 1);
                int k = counts.get(cards[i]);
                if(k >= 3){
                    counts.put(cards[i],k - 2);
                }
            }
            else{
                counts.put(cards[i],1);
                ++c;
            }
        }
        int cc = 0;
        for (int i:counts.keySet()){
            int k = counts.get(i);
            if(k == 2){
                ++cc;
            }
        }
        if(cc % 2 == 1){
            --c;
        }
        System.out.println(c);





    }

}