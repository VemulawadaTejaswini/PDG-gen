import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int k = sc.nextInt();
        
        char ch = s.toCharArray()[k-1];
        
        char[] a = s.toCharArray();
        for (int i=0; i < s.length(); i++) {
            if (a[i] != ch) a[i] = '*';
        }
        
        System.out.println(String.valueOf(a));
    }
}
