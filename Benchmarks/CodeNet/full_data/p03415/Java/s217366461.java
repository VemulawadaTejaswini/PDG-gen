import java.util.*;

class Main{
    public static void main(String[] args)throws Exception {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String c = sc.next();

        System.out.println(Character.toString(a.charAt(0) + b.charAt(1) + c.charAt(2)));
    }
}