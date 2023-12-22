import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] sp = s.split("");
        System.out.println(sp[0]+(sp.length-2)+sp[sp.length-1]);
     }
}
