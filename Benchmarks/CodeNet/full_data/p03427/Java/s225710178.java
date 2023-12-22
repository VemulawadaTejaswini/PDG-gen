import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n = sc.next();
        int len = n.length();
        
        if (n.charAt(0) != '9') {
            int ans = 9 * (len - 1) + (n.charAt(0) - '0' - 1);
            System.out.println(ans);
            return;
        }
        
        int numI = 9;
        for (int i = 1; i < len; i++) {
            if (n.charAt(i) != '9') {
                numI = n.charAt(i-1) - '0';
                break;
            }
        }
        
        int ans = 9 * (len - 1) + numI - 1;
        
        System.out.println(ans);
    }
}