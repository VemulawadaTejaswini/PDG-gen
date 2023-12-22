import java.util.*;
import java.util.Map;
import java.util.TreeMap;
 
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
 
        int N = sc.nextInt();

        if(N<100){
            System.out.println(0);
            return;
        }

        int ans = 0;
        for(int i=100; i<=N; i++){
            String Ns = String.valueOf(i);
            TreeMap<String, Integer> map = new TreeMap<String, Integer>();
            map.put("3", 0);
            map.put("5", 0);
            map.put("7", 0);
            for(int j=0; j<Ns.length(); j++){
                String a = String.valueOf((char)Ns.charAt(j));
                if(map.containsKey(a)){
                    map.put(a, map.get(a) + 1);
                }
            }
            if(map.get("3")!=0 && map.get("5")!=0 && map.get("7")!=0){
                int sum = map.get("3") + map.get("5") + map.get("7");
                if(sum==Ns.length()){
                    ans += 1;
                }
            }
        }
        System.out.println(ans);
    }
}