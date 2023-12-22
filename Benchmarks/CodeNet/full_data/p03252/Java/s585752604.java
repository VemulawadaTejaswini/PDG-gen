import java.util.*;
import java.util.Map;
import java.util.TreeMap;
 
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
 
        String S = sc.next();
        String T = sc.next();
        TreeMap<Character, Character> maps = new TreeMap<Character, Character>();
        TreeMap<Character, Character> mapt = new TreeMap<Character, Character>();
        
        for(int i=0; i<S.length(); i++){
            char s = S.charAt(i);
            char t = T.charAt(i);
            if(maps.containsKey(s)){
                if(maps.get(s)!=t){
                    System.out.println("No");
                    return;
                }
            }
            else if(mapt.containsKey(t)){
                if(mapt.get(t)!=s){
                    System.out.println("No");
                    return;
                }
            }
            else{
                maps.put(s, t);
                mapt.put(t, s);
            }
        }
        System.out.println("Yes");
    }
}