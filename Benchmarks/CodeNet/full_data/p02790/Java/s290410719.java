import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int[] base = {1,11,111,1111,11111,111111,1111111,11111111,111111111};
        
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        
        int x = a*base[b-1];
        int y = b*base[a-1];
        
        System.out.println(x>y?y:x);
    }
}