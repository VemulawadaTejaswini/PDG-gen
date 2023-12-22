import java.util.*;
import java.io.*;
 
public class Main{
    ArrayList<Long> list;
    HashMap<Long,Integer> map,rmap;
    long ltotal,rtotal;
    long ans;
    
    public static void main(String[] args){
        Main m = new Main();
        m.input();
        m.solve();
    }
 
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ltotal = 0;
        rtotal = 0;
        ans = 0;
        list = new ArrayList<Long>();
        map = new HashMap<Long,Integer>();
        rmap = new HashMap<Long,Integer>();
        for(int i = 0; i < n; i++){
            long num = sc.nextLong();
            list.add(num);
            ltotal += num;
            if(ltotal == 0){
                ans++;
                long stmp = 1000000000;
                if(map.containsKey(stmp)){
                    int tmp = map.get(stmp) + 1;
                    map.put(stmp,tmp);
                }else{
                    map.put(stmp,1);
                }
            }else{
                if(map.containsKey(ltotal)){
                    int tmp = map.get(ltotal) + 1;
                    map.put(num,tmp);
                }else{
                    map.put(num,1);
                }
            }
        }
        sc.close();
    }
    

    public void solve(){
        int max = list.size();
        long now = 0;
        for(int i = 0; i < max; i++){
            now = now + list.get(i);
            if(now == 0){
                long stmp = 1000000000;
                if(map.containsKey(stmp)){
                    int tmp = map.get(stmp) - 1;
                    if(tmp >= 0){
                        map.put(stmp,tmp);
                    }
                }
            }else{
                if(map.containsKey(now)){
                    int tmp = map.get(now) - 1;
                    if(tmp >= 0){
                        map.put(now,tmp);
                    }
                }
            }
            if(map.containsKey(now)){
                int tmp = map.get(now);
                ans += tmp;
            }
        }
        System.out.println(ans);
    }
    
}