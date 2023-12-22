import java.util.*;

public class Main{
    public static void main(String[] argc){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(str.charAt(0)-'0' + str.charAt(1) - '0' + str.charAt(2) - '0');
    }
}