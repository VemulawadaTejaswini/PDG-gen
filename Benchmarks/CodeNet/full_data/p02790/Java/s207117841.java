import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int[] base = {1,11,111,1111,11111,111111,1111111,11111111,111111111};
        
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        
        String x = Integer.toString(a*base[b-1]);
        String y = Integer.toString(b*base[a-1]);
        
        System.out.println(x.compareTo(y)>0?y:x);
    }
}