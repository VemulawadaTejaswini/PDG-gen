import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        char[] sl = s.toCharArray();
        char[] tl = t.toCharArray();
        int len = sl.length-tl.length;
        for(int i = len; i >= 0; i--){
            boolean bool = true;
            for(int j = 0; j < tl.length; j++){
                if(sl[i+j] != tl[j] && sl[i+j] != '?'){
                    bool = false;
                    break;
                }
            }
            if(bool){
                String top = s.substring(0,i).replace("?","a");
                String last = s.substring(i+tl.length, sl.length).replace("?","a");
                System.out.println(top + t + last);
                return;
            }
        }
        System.out.println("UNRESTORABLE");
    }
}
