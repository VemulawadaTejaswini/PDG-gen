import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        final String S  = scanner.next();
        String T = "";
        boolean match = extend(T, S);
        if(match){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
    public static boolean extend(String t, String s){
        if(t.length() > s.length()){
            return false;
        }
        if(! t.equals(s.substring(0,t.length()))){
            return false;
        }
        else if(t.length() == s.length()){
            return true;
        }
        else{
            boolean a = extend(t + "dream", s);
            if(a) return(true);
            boolean b = extend(t + "dreamer", s);
            if(b) return(true);
            boolean c = extend(t + "erase", s);
            if(c) return(true);
            boolean d = extend(t + "eraser", s);
            if(d) return(true);
            return(false);
        }
    }
}