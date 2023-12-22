import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = s.replaceAll(".", "x");
        System.out.println(t);
    }
}
