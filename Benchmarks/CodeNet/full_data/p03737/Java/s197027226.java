import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String c = sc.next();

        System.out.println(a.toUpperCase().substring(0, 1) + b.toUpperCase().substring(0, 1) + c.toUpperCase().substring(0, 1));
    }
}
