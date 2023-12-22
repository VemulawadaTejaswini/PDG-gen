import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    Map<String, Integer> map = new HashMap<>();
    String S = sc.next();
    String[] s = S.split("");
    for(int i=0; i<s.length; i++) {
        if(map.containsKey(s[i])) {
            map.put(s[i], map.get(s[i])+1);
        }else {
            map.put(s[i], 1);
        }
    }
    Map<String, Integer> mmap = new TreeMap<>();
    ArrayList<String> delete = new ArrayList<>();
    for(int x=1; x<n; x++) {
        S = sc.next();
        s = S.split("");
        mmap = new HashMap<>();
        for(int i=0; i<s.length; i++) {
            if(mmap.containsKey(s[i])) {
                mmap.put(s[i], map.get(s[i])+1);
            }else {
                mmap.put(s[i], 1);
            }
        }
        
        
        for(String key : map.keySet()) {
            if(mmap.containsKey(key)) {
                map.put(key, Math.min(map.get(key), mmap.get(key)));
            }else {
                delete.add(key);
            }
        }
    }
    
    for(String str : delete) {
        map.remove(str);
    }
    String ans = "";
    for(String key : map.keySet()) {
        for(int i=0; i<map.get(key); i++) {
            ans += key;
        }
    }
    System.out.println(ans);
  }
}