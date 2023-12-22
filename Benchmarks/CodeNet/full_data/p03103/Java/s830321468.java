import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        long ans=0;
        Map <Long,Long>map=new TreeMap<>();
        for(int i=0;i<n;i++){
            long a=sc.nextLong();
            long b=sc.nextLong();
            if(map.get(a)!=null){
                map.put(a,b+map.get(a));
            }else{
                map.put(a,b);
            }
        }
        for(long key:map.keySet()){
            if(map.get(key)<=m){
                ans+=key*map.get(key);
                m-=map.get(key);
            }else{
                ans+=key*m;
                break;
            }
        }
        System.out.println(ans);

    }
}