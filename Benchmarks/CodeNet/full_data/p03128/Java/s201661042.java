import java.util.*;
import java.io.*;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args)throws IOException{
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt(), m = sc.nextInt();
        boolean[] rec = new boolean[10];
        for(int i=0;i<m;i++) {
            int a= sc.nextInt();
            rec[a] = true;
        }
        HashSet<Integer> dic = new HashSet<>();
        for(int i=1;i<10;i++){
            if(rec[i]) dic.add(i);
        }
        if(rec[5]){
            dic.remove(2);
            dic.remove(3);
        }
        if(rec[3]) dic.remove(2);
        if(rec[7]||rec[1]){
            dic.remove(6);
            dic.remove(9);
        }
        if(rec[1]) dic.remove(4);
        if(rec[9]) dic.remove(6);
        int[] cost = new int[]{0,2,5,5,4,5,6,3,7,6};
        int[] val = new int[]{0,0,1,7,4,5,6,8};
        ArrayList<Integer> digit= new ArrayList<>();
        for(int w:dic) digit.add(w);
        Collections.sort(digit);
        int[] len = new int[10000+10];
        Arrays.fill(len,-10);
        HashMap<Integer,Integer>[] pair = new HashMap[n+1];
        for(int i=0;i<=n;i++) pair[i] = new HashMap<>();
        for(int w:digit){
            pair[cost[w]].put(w,1);
            len[cost[w]] = 1;
        }
        for(int i=1;i<=n;i++){
            for(int w:digit){
                int from = i-cost[w];
                if(from<0||len[from]+1<len[i]) continue;
                boolean flag = false;
                if(len[from]+1>len[i]){
                    flag = true;
                }
                for(int j=digit.size()-1;j>=0;j--){
                    int cur = digit.get(j);
                    int change = pair[from].getOrDefault(cur,0)+(cur==w?1:0);
                    int now = pair[i].getOrDefault(cur,0);
                    if(change>now){
                        flag = true;
                        break;
                    }
                }
                if(flag){
                    len[i] = len[from]+1;
                    pair[i] = new HashMap<>();
                    for(int e:pair[from].keySet()) pair[i].put(e,pair[from].get(e));
                    pair[i].put(w,pair[i].getOrDefault(w,0)+1);
                }
            }
        }
        ArrayList<Integer> res = new ArrayList<>();
        for(int w:pair[n].keySet()){
            int time = pair[n].get(w);
            for(int i=0;i<time;i++)  res.add(w);
        }
        Collections.sort(res);
        for(int i=res.size()-1;i>=0;i--) System.out.print(res.get(i));
    }
}
