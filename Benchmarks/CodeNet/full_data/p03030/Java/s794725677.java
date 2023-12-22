// https://atcoder.jp/contests/abc128/tasks/abc128_b

import java.util.Scanner;
import java.util.TreeMap;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        TreeMap<String,TreeMap<Integer,Integer>> map = new TreeMap<>();
        for (int i=1;i<N+1;i++){
            String S = sc.next();
            int P = sc.nextInt();
            TreeMap<Integer,Integer> pi;
            if (map.containsKey(S)){
                pi = map.get(S);
            } else {
                pi = new TreeMap<>();
            }
            pi.put(P,i);
            map.put(S,pi);
        }
        for (String s:map.keySet()){
            Object[] key = map.get(s).keySet().toArray();
            Arrays.sort(key,Collections.reverseOrder());
            for (Object i:key){
                System.out.println(map.get(s).get(i));
            }
        }
    }
}