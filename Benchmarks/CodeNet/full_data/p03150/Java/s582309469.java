import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String k = "keyence";
        String s = sc.next();
        int len = k.length();
        boolean bool = false;
        for(int i = 0; i < len; i++){
            String k1 = k.substring(0,i);
            String k2 = k.substring(i,len);
            int a1 = s.indexOf(k1);
            int a2 = s.indexOf(k2,a1);
            if(a2 != -1){
                bool = true;
                break;
            }
        }
        System.out.println(bool ? "YES" : "NO");
    }
}
