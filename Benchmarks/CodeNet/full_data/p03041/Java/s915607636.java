import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String s = sc.next();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++) {
            if(i == k-1) sb.append(String.valueOf(s.charAt(i)).toLowerCase());
            else sb.append(s.charAt(i));
        }
        System.out.println(sb.toString());
    }
}
