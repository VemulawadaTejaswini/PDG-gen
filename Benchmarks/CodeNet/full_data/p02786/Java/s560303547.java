import java.util.*;
public class Main { 
    int cnt = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(helper(n));
    }

    private static void helper(int h) {
       cnt++;
       if(h == 1) {
            return;
       }
       helper(h/2); helper(h/2);
    }
}