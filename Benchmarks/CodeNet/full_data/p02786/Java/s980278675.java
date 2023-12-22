import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long h=sc.nextLong();
        HashMap<Long,Long> map=new HashMap<>();
        long res = dfs(h,map);
        System.out.println(res);
    }

    public static long dfs(long h,HashMap<Long,Long> map)
    {
        long ans=1;
        if(h<=1)return ans;
        if(map.get(h)!=null)return map.get(h);
        long cur=dfs(h/2,map);
        ans+=2*cur;
        map.put(h,ans);
        return ans;
    }
}