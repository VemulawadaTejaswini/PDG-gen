import java.io.*;
import  java.util.*;

import static java.lang.System.in;

class Main{
    static HashMap<Integer,Integer>[] rec;
    static int[] count;
    static int n,m;
    public static void main(String[] args)throws IOException{
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); m = sc.nextInt();
        count = new int[m];
        rec = new HashMap[m];
        for(int i=0;i<m;i++) rec[i]=new HashMap<>();
        for(int i=0;i<n;i++){
            int x = sc.nextInt();
            int pos = x%m;
            count[pos]++;
            rec[pos].put(x,rec[pos].getOrDefault(x,0)+1);
        }
        int ans = 0;
        for(int i=1;i<=(m-1)/2;i++){
            ans += help(i);
        }
        ans += count[0]/2;
        if(m%2==0) ans += count[m/2]/2;
        System.out.println(ans);
    }
    static int help(int i){
        int j = m-i;
        if(count[i]==count[j]) return count[i];
        int remain = Math.abs(count[i]-count[j]);
        HashMap<Integer,Integer> map = count[i]<count[j]?rec[j]:rec[i];
        int ans = Math.min(count[i],count[j]);
        for(int w:map.keySet()){
            if(remain==0) break;
            int cur = Math.min(remain,map.get(w))/2;
            ans += cur;
            remain -= cur*2;
        }
        return ans;
    }
}
