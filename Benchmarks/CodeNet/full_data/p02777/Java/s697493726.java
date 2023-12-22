import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        int cnt1 = sc.next();
        int cnt2 = sc.next();
        if(sc.next().equals(s1))
        	cnt1--;
        else
        	cnt2--;
        System.out.println(cnt1 + " " + cnt2);
    }
}
