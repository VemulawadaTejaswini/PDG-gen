import java.util.*;
public class Main{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();

        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            String s = sc.next();
            if(map1.get(s)==null) map1.put(s,0); map2.put(s,0);
            map1.put(s, map1.get(s)+1);
        }
        int m = sc.nextInt();
        for(int i=0; i<m; i++){
            String t = sc.next();
            if(map2.get(t)==null) map2.put(t,0);
            map2.put(t, map2.get(t)+1);
        }
        int max = 0;
        for(String key : map1.keySet()){
            max = Math.max(map1.get(key)-map2.get(key),max);
        }
        System.out.println(max);
    }
}
