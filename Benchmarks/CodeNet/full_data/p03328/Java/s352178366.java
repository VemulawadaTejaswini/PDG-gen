import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int N = (int)(b-a);
        int h = wa(N-1);
        System.out.println(h-a);
    }
    
    public static int wa(int x) {
        if(x == 1) {
            return 1;
        }else {
            return x + wa(x-1);
        }
    }
}