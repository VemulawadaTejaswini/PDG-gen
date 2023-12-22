import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
 
public class Main {
 
    public static void main(String[] args) {
        // Mapの宣言
        Map<Long, Long> mMap = new HashMap<Long, Long>();
        
        Scanner scanner = new Scanner(System.in);
        int N=scanner.nextInt();
        int M=scanner.nextInt();
        
        long a,b;
        for(int i=0;i<N;i++){
            a=scanner.nextLong();
            b=scanner.nextLong();
            mMap.put(a,b);
        }
        
        // キーでソートする
        Object[] mapkey = mMap.keySet().toArray();
        Arrays.sort(mapkey);
        
        List<Long> list = new ArrayList<>(mMap.keySet());
        //System.out.println(list);
        List<Long> list2 = new ArrayList<>(mMap.values());
        //System.out.println(list2);
        
        long ans=0;
        long cnt=0;
        int i=0;
        
        
        while(cnt<M){
            cnt+=list2.get(i);
            ans+=list.get(i)*list2.get(i);
            i++;
        }
        
        if(cnt>M){
            ans-=list.get(i-1)*(cnt-M);
        }
        System.out.println(ans);
        
    }
 
}