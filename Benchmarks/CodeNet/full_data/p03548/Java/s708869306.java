import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.next());
        int y = Integer.parseInt(sc.next());
        int z = Integer.parseInt(sc.next());
        int ans = ((x-z) / (y+z));
        System.out.println(ans);
    }
}