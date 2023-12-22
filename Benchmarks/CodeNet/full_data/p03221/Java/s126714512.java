import java.util.*;
import java.util.Map;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.Collections;
 
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
 
        int N = sc.nextInt();
        int M = sc.nextInt();
        String[] P = new String[M];
        int[] Y = new int[M];
        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i=0; i<M; i++){
            P[i] = sc.next();
            Y[i] = sc.nextInt();
            list.add(Y[i]);
        }
        
        Collections.sort(list);
        Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
        for(int i=0; i<M; i++){
            map.put(list.get(i), i + 1);
        }

        String[] n = new String[M];
        for(int i=0; i<M; i++){
            n[i] = String.valueOf(map.get(P[i]));
            int lp = P[i].length();
            int ln = n[i].length();
            if(lp<6){
                for(int j=0; j<5; j++){
                    P[i] = "0" + P[i];
                    lp = P[i].length();
                    if(lp==6){
                        break;
                    }
                }
            }
            if(ln<6){
                for(int j=0; j<5; j++){
                    n[i] = "0" + n[i];
                    ln = n[i].length();
                    if(ln==6){
                        break;
                    }
                }
            }
            String ans = P[i] + n[i];
            System.out.println(ans);
        }
    }
}