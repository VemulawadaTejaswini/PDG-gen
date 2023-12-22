import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String h = sc.next();
        String n = sc.next();
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        String u = sc.next();
        if(u.equals(h)){
            a--;
        }else{
            b--;
        }
        System.out.println(a + " " + b);
    }
}