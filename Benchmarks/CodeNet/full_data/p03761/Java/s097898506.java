import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TreeMap<String,Integer> map = new TreeMap<String,Integer>();
        char[] first = sc.next().toCharArray();
        for(char c : first){
            String s = String.valueOf(c);
            if(map.containsKey(s)){
                map.put(s,map.get(s)+1);
            }else{
                map.put(s,1);
            }
        }
        for(int i = 1; i < n; i++){
            String tmp = sc.next();
            int len = tmp.length();
            HashSet<String> del = new HashSet<String>();
            for(Map.Entry<String, Integer> e : map.entrySet()){
                String k = e.getKey();
                int v = e.getValue();
                int cnt = 0;
                int index = 0;
                while(index < len){
                    int chk = tmp.indexOf(k,index);
                    if(chk == -1){
                        break;
                    }else{
                        cnt++;
                        index = chk+1;
                    }
                }
                if(cnt != 0){
                    map.put(k,Math.min(v,cnt));
                }else{
                    del.add(k);
                }
            }
            for(String s : del){
                map.remove(s);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(Map.Entry<String, Integer> e : map.entrySet()){
            String k = e.getKey();
            int v = e.getValue();
            for(int i = 0; i < v; i++){
                sb.append(k);
            }
        }
        System.out.println(sb.toString());
    }
}
