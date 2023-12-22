import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String s = scan.next();
        String t1 = s.substring(0, n / 2);
        String t2 = s.substring(n / 2);
        System.out.println(t1.equals(t2) ? "Yes" : "No");
        scan.close();
    }
}