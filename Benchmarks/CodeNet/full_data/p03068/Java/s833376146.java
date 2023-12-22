import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int k = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if(s.charAt(i) != s.charAt(k-1)) s = s.replace(s.charAt(i), '*');
        }

        System.out.println(s);
        sc.close();
    }

}
