import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int k = sc.nextInt() - 1;
        char target = s.charAt(k);
        for(int i = 0; i < n; ++i) {
            char c = s.charAt(i);
            System.out.print((c == target) ? c : '*');
        }
        System.out.println();
    }
}
