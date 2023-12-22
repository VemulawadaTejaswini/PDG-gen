import java.util.*;
public class Main {
    public static void main(String[] args) {
        long ans = 0;
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int l = str.length();
        for (int i = 0; i < l / 2; i++) {
            String a = str.substring(i, i + 1);
            String b = str.substring(l - i - 1, l - i);
            if(!(a.equals(b))) ans++;
        }
        System.out.println(ans);
    }
}