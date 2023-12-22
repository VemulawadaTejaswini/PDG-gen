//https://atcoder.jp/contests/abc126/tasks/abc126_d

import java.util.Scanner;
import java.util.TreeMap;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] ans = new int[N];
        TreeMap<Integer,TreeMap<Integer,Integer>> map = new TreeMap<>();
        TreeMap<Integer,Integer> vw = new TreeMap<>();
        for (int i=0;i<N-1;i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            int w = sc.nextInt()%2;
            if (map.containsKey(u)){
                vw = map.get(u);
                vw.put(v,w);
                map.put(u,vw);
            } else {
                vw = new TreeMap<>();
                vw.put(v,w);
                map.put(u,vw);
            }
        }
        for (Integer I:map.keySet()){
            for (Integer J:map.get(I).keySet()){
                if (map.get(I).get(J)!=0 && ans[I-1]==ans[J-1]){
                    ans[J-1] = Math.abs(ans[I-1]-1);
                }
            }
        }
        for (int i:ans){
            System.out.println(i);
        }
    }
}