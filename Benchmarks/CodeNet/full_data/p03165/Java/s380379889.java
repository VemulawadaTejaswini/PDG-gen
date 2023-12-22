import java.io.*;
import java.util.*;
public class Main {
    static String solve(String a, String b, int ia, int ib, HashMap<String, String> map) {
        if(ia >= a.length() || ib >= b.length()) {
            return "";
        }
        
        String key = ia + "," + ib;
        if(map.containsKey(key))
            return map.get(key);
        
        String s1 = solve(a, b, ia + 1, ib, map);
        String s2 = solve(a, b, ia, ib + 1, map);
        String s3 = "";
        if(a.charAt(ia) == b.charAt(ib))
            s3 = a.charAt(ia) + solve(a, b, ia + 1, ib + 1, map);
        
        String s = "";
        if(s1.length() > s2.length())
            s = s1;
        else 
            s = s2;
            
        if(s.length() < s3.length())
            s = s3;
        map.put(key, s);
        return s;
    }
    
    
    public static void main(String args[]) {
        String a = null, b = null;
        try (Scanner scanner = new Scanner(System.in)) {
            a = scanner.nextLine();
            b = scanner.nextLine();
        }
        
        HashMap<String, String> map = new HashMap();
        String ret = solve(a, b, 0, 0, map);
        // System.out.println(map);
        System.out.println(ret);
        
    }
}