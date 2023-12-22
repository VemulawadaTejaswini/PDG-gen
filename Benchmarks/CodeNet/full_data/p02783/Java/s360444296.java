import java.util.*;
public class Main { 
    static long cnt = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long  n = sc.nextInt();
      	helper(n);
        System.out.println(cnt);
    }

    private static void helper(long h) {
       cnt++;
       if(h == 1) {
            return;
       }
       helper(h/2); helper(h/2);
    }
}