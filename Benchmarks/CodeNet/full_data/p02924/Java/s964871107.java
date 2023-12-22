import java.util.*;
 
public class Main {
 
    static int array[];
    static int ans[];
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();     
        long ans = 0;
 
        for (int i = 1; i < n; i++) {
            ans += i;
        }
 
        System.out.println(ans);
 
        sc.close();
 
    }
 
}